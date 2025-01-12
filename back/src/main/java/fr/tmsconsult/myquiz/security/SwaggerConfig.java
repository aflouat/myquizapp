package fr.tmsconsult.myquiz.security;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("MDD API")
                        .description("Monde de développement API documentation")
                        .version("1.0.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description(" Wiki Documentation")
                        .url("https://github.com/aflouat/P6-MDD-MVP-une-application-full-stack/wiki/Mode-de-developpement"));
    }
}
