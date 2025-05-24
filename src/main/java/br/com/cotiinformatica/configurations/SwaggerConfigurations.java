package br.com.cotiinformatica.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API Pedidos - Kaio Muniz")
                .description("Documentação da API desenvolvida com Spring Boot")
                .version("1.0.0")
                .contact(new Contact()
                    .name("Kaio Muniz")
                    .url("https://www.kaiomuniz.com.br")
                    .email("contato@kaiomuniz.com.br")));
    }
}
