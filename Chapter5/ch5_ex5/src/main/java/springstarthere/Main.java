package springstarthere;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import springstarthere.config.ProjectConfig;
import springstarthere.services.CommentService;
import springstarthere.services.UserService;

public class Main {
    public static void main( String[] args ) {

        // import springstarthere.config.ProjectConfig;
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println();

        CommentService cs1 = context.getBean(CommentService.class);
        
        CommentService cs2 = context.getBean(CommentService.class);

        boolean bCommentService = cs1 == cs2;
        System.out.println("CommentService cs1 == cs2 with @Scope prototype:  " + bCommentService);

        System.out.println();

        UserService us1 = context.getBean(UserService.class);
        UserService us2 = context.getBean(UserService.class);

        boolean bUserService = us1 == us2;
        System.out.println("UserService us1 == us2 with @Scope sigleton:  " + bUserService);


    }
}