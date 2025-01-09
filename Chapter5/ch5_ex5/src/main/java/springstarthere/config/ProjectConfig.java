package springstarthere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.BeanDefinition;

import springstarthere.services.CommentService;
import springstarthere.services.UserService;

@Configuration
public class ProjectConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)  // import org.springframework.context.annotation.Configuration;
    public CommentService commentService() {
        return new CommentService();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }

}