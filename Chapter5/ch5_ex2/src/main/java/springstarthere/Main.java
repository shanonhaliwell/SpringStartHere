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

        CommentService cs = context.getBean(CommentService.class);
        var us = context.getBean(UserService.class);

        CommentRepository commentRepo1 = cs.getCommentRepository();
        CommentRepository commentRepo2 = us.getCommentRepository();

        boolean b = commentRepo1 == commentRepo2;
        System.out.println("True or False of commentRepo1 == commentRepo2:  " + b);

        
    }
}