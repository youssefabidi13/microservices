package com.abidiyoussef.loans;

import com.abidiyoussef.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.abidiyoussef.loans.controller") })
@EnableJpaRepositories("com.abidiyoussef.loans.repository")
@EntityScan("com.abidiyoussef.loans.model")*/
@EnableConfigurationProperties(value = { LoansContactInfoDto.class })
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "ABIDI Youssef Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Youssef Abidi",
						email = "youssefabidi929@gmail.com",
						url = "https://www.linkedin.com/in/abidiyoussef/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/abidiyoussef/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Youssef ABIDI github profile",
				url = "https://github.com/youssefabidi13"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
