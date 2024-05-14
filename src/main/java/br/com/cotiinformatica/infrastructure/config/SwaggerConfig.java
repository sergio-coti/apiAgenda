package br.com.cotiinformatica.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI customOpenApi() {
		
		OpenAPI openAPI = new OpenAPI()
				.components(new Components())
				.info(new Info()
						.title("API Agenda - COTI Informática")
						.description("API Spring Boot para controle de tarefas.")
						.version("v1")
						.contact(new Contact()
								.name("COTI Informática")
								.email("contato@cotiinformatica.com.br")
								.url("http://www.cotiinformatica.com.br")));
		
		return openAPI;
	}
}
