package springstarthere;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springstarthere.config.ProjectConfig;

import springstarthere.model.Comment;
import springstarthere.services.CommentService;


public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());


    public static void main( String[] args ) {


        // import springstarthere.config.ProjectConfig;
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        
        Comment comment = new Comment();

        comment.setAuthor("Harry");
        comment.setText("has a unique relationship with Emma, her daughter.");


        String output = commentService.publishComment(comment);
        logger.info(output);
        
        commentService.deleteComment(comment);
        commentService.editComment(comment);

        


    }
}