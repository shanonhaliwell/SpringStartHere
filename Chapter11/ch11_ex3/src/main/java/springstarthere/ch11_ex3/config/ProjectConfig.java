package springstarthere.ch11_ex3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ProjectConfig {

    // import org.springframework.web.reactive.function.client.WebClient;
    @Bean
    public WebClient webClient() {

        return WebClient
                    .builder()
                    .build();

    }
    
}