package springstarthere.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import springstarthere.model.Comment;

import springstarthere.proxies.CommentNotificationProxy;
import springstarthere.repositories.CommentRepository;

@Service
public class CommentService {

    // make instance variables
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    // constructor
    //public CommentService(CommentRepository commentRepository, @Qualifier("commentPushNotificationProxy")CommentNotificationProxy commentNotificationProxy) {
    public CommentService(CommentRepository commentRepository, @Qualifier("Push")CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}