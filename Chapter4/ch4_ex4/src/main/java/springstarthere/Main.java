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

        /** When you retrieve the CommentService bean from the context using context.getBean(CommentService.class), 
         * Spring already ensures that all its dependencies are injected and ready to use. 
         * You don't need to manually retrieve and inject DBCommentRepository and EmailCommentNotificationProxy beans 
         * because Spring does this for you during the creation of CommentService.
         */

        
        Comment comment = new Comment();

        comment.setAuthor("Harry");
        comment.setText("has a unique relationship with Emma, her daughter");

        commentService.publishComment(comment);

    }
}