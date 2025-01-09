package springstarthere.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springstarthere.proxies.CommentNotificationProxy;
import springstarthere.proxies.EmailCommentNotificationProxy;

import springstarthere.repositories.CommentRepository;
import springstarthere.repositories.DBCommentRepository;

import springstarthere.services.CommentService;


@Configuration
public class ProjectConfiguration {

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {

        return new CommentService(commentRepository, commentNotificationProxy);
    }
    /** The reason don't need to directly call context.getBean(DBCommentRepository.class) and context.getBean(EmailCommentNotificationProxy.class)
     * is because of using dependency injection to provide these beans to the CommentService.
     * By defining a bean for CommentService, and in the method signature, you declare the required dependencies (CommentRepository and CommentNotificationProxy)
     * Spring will automatically resolve and inject the CommentRepository and CommentNotificationProxy beans when creating the CommentService bean
     */

    
}