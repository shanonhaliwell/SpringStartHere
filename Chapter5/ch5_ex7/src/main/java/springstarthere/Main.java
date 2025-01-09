package springstarthere;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import springstarthere.config.ProjectConfig;
import springstarthere.model.Comment;
import springstarthere.processors.CommentProcessor;
import springstarthere.repositories.CommentRepository;
import springstarthere.services.CommentService;
import springstarthere.services.UserService;

public class Main {
    public static void main( String[] args ) {


        // import springstarthere.config.ProjectConfig;
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        
        Comment comment = new Comment();

        comment.setAuthor("Harry");
        comment.setText("has a unique relationship with Emma, her daughter.");

        CommentService commentService = context.getBean(CommentService.class);

        System.out.println("commentProcessor1");
        CommentProcessor commentProcessor1 = commentService.sendComment(comment);

        System.out.println("commentProcessor2");
        CommentProcessor commentProcessor2 = commentService.sendComment(comment);


    }
}