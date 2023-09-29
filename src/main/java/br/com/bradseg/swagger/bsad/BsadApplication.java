package br.com.bradseg.swagger.bsad;

import io.swagger.v3.oas.annotations.servers.Servers;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BsadApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsadApplication.class, args);
    }


    @Bean
    public OpenAPI springShopOpenAPI() {
        Server server = new Server();
        server.setUrl("wsphttp.bradseg.com.br");
        return new OpenAPI()
                .info(new Info().title("Documentação da Nova Jornada Renovação RE")
                        .description("API para a nova Jornada de renovação RE")
                        .version("v0.0.2")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .servers(List.of(server));
//                .externalDocs(new ExternalDocumentation()
//                        .description("SpringShop Wiki Documentation")
//                        .url("http://wsphttp.dsv.bradseg.com.br"))

    }
}
