package springstarthere;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import springstarthere.config.ProjectConfig;
import springstarthere.repositories.CommentRepository;
import springstarthere.services.CommentService;
import springstarthere.services.UserService;

public class Main {
    public static void main( String[] args ) {

        // import springstarthere.config.ProjectConfig;
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        CommentService cs = context.getBean(CommentService.class);
        UserService us = context.getBean(UserService.class);

        System.out.println();

        CommentRepository commentRepo1 = cs.getCommentRepository();
        CommentRepository commentRepo2 = us.getCommentRepository();

        CommentRepository commentRepo3 = context.getBean(CommentRepository.class);

        System.out.println("CommentRepository @Scope prototype  commentRepo1 != commentRepo2:  " + (commentRepo1 != commentRepo2));

    }
}