package springstarthere.ch11_ex1.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableFeignClients(basePackages = "springstarthere.ch11_ex1.proxy")
public class ProjectConfig {

}