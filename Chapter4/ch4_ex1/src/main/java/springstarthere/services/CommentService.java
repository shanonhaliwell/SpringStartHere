package springstarthere.services;

import springstarthere.model.Comment;

import springstarthere.proxies.CommentNotificationProxy;
import springstarthere.repositories.CommentRepository;

public class CommentService {

    // instance variables
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