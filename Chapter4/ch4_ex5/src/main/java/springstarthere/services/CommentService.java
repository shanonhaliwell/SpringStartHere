package springstarthere.services;

import org.springframework.stereotype.Component;

import springstarthere.model.Comment;

import springstarthere.proxies.CommentNotificationProxy;
import springstarthere.repositories.CommentRepository;

@Component
public class CommentService {

    // make instance variables
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    // constructor
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}