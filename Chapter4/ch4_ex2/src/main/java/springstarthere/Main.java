package springstarthere;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springstarthere.configuration.ProjectConfiguration;
import springstarthere.model.Comment;

// import springstarthere.proxies.CommentNotificationProxy;
// import springstarthere.proxies.EmailCommentNotificationProxy;
// import springstarthere.repositories.CommentRepository;
// import springstarthere.repositories.DBCommentRepository;

import springstarthere.services.CommentService;

public class Main {
    public static void main( String[] args ) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        CommentService commentService = context.getBean(CommentService.class);

        /*
        CommentRepository commentRepository = new DBCommentRepository();

        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
        */

        Comment comment = new Comment();

        comment.setAuthor("Harry");
        comment.setText("has a unique relationship with Emma, her daughter");

        commentService.publishComment(comment);

    }
}