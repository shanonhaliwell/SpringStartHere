package springstarthere;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springstarthere.repositories.CommentRepository;
import springstarthere.services.CommentService;
import springstarthere.services.UserService;

import springstarthere.config.ProjectConfig;

public class Main {
    public static void main( String[] args ) {

        // import springstarthere.config.ProjectConfig;
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the CommentService and UserService");

        CommentService cs = context.getBean(CommentService.class);

        UserService us = context.getBean(UserService.class);

        System.out.println("After retrieving the CommentService and UserService.");

        
    }
}