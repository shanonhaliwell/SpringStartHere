package springstarthere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springstarthere.model.Comment;

import springstarthere.proxies.CommentNotificationProxy;
import springstarthere.repositories.CommentRepository;

@Component
public class CommentService {

    // instance variables
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    // constructor
    @Autowired  // @Autowired can be removed here without any compilling issue
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}