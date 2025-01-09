package springstarthere.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"springstarthere.proxies", "springstarthere.repositories", "springstarthere.services"})
public class ProjectConfiguration {}