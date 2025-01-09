package springstarthere.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"springstarthere.processors", "springstarthere.repositories", "springstarthere.services"})
public class ProjectConfig {

}