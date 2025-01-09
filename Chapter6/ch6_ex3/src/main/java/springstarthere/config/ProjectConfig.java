package springstarthere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import springstarthere.aspects.LoggingAspect;

@Configuration
@ComponentScan(basePackages = {"springstarthere.services", "springstarthere.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }

}