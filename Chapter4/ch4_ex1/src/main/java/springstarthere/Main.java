package springstarthere;

import springstarthere.model.Comment;

import springstarthere.proxies.CommentNotificationProxy;
import springstarthere.proxies.EmailCommentNotificationProxy;

import springstarthere.repositories.CommentRepository;
import springstarthere.repositories.DBCommentRepository;

import springstarthere.services.CommentService;

public class Main {
    public static void main( String[] args ) {
        
        CommentRepository commentRepository = new DBCommentRepository();

        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment();

        comment.setAuthor("Harry");

        comment.setText("has a unique relationship with Emma, her daughter");

        commentService.publishComment(comment);


    }
}