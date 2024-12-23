package com.abidiyoussef.accounts.service.impl;


import com.abidiyoussef.accounts.dto.AccountsDto;
import com.abidiyoussef.accounts.dto.CardsDto;
import com.abidiyoussef.accounts.dto.CustomerDetailsDto;
import com.abidiyoussef.accounts.dto.LoansDto;
import com.abidiyoussef.accounts.entity.Accounts;
import com.abidiyoussef.accounts.entity.Customer;
import com.abidiyoussef.accounts.exception.ResourceNotFoundException;
import com.abidiyoussef.accounts.mapper.AccountsMapper;
import com.abidiyoussef.accounts.mapper.CustomerMapper;
import com.abidiyoussef.accounts.repository.AccountsRepository;
import com.abidiyoussef.accounts.repository.CustomerRepository;
import com.abidiyoussef.accounts.service.ICustomersService;
import com.abidiyoussef.accounts.service.client.CardsFeignClient;
import com.abidiyoussef.accounts.service.client.LoansFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomersServiceImpl implements ICustomersService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    /**
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a given mobileNumber
     */
    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId) {
        Customer customer = customerRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber)
        );
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                () -> new ResourceNotFoundException("Account", "customerId", customer.getCustomerId().toString())
        );

        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
        customerDetailsDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));

        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(correlationId,mobileNumber);
        if(null != loansDtoResponseEntity) {
            customerDetailsDto.setLoansDto(loansDtoResponseEntity.getBody());
        }

        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(correlationId,mobileNumber);
        if(null != cardsDtoResponseEntity) {
            customerDetailsDto.setCardsDto(cardsDtoResponseEntity.getBody());
        }
        return customerDetailsDto;

    }
}