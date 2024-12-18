package com.abidiyoussef.accounts.service.client;

import com.abidiyoussef.accounts.dto.CardsDto;
import com.abidiyoussef.accounts.dto.LoansDto;
import jakarta.validation.constraints.Pattern;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="loans",fallback = LoansFallback.class)
public interface LoansFeignClient {
    @GetMapping(value = "/api/fetch",consumes = "application/json")
    public ResponseEntity<LoansDto> fetchLoanDetails(@RequestHeader("abidiBank-correlation-id")
                                                         String correlationId,@RequestParam String mobileNumber);
}
