package springstarthere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import springstarthere.aspects.LoggingAspect;
import springstarthere.aspects.SecurityAspect;

@Configuration
@ComponentScan(basePackages = {"springstarthere.services", "springstarthere.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

    // Order of Aspects are in the order of below
    // In this case, LoggingAspect is called first and delegates to the SecurityAspect
    // The SecurityAspect is called second and delegates to the intercepted method
    
    /*
    @Bean
    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }
    */

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    
    @Bean
    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }
    

}