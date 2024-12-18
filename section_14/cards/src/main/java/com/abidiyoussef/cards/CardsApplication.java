package com.abidiyoussef.cards;

import com.abidiyoussef.cards.dto.CardsContactInfoDto;
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
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
/*@ComponentScans({ @ComponentScan("com.abidiyoussef.cards.controller") })
@EnableJpaRepositories("com.abidiyoussef.cards.repository")
@EntityScan("com.abidiyoussef.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "ABIDI Youssef Cards microservice REST API Documentation",
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
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
