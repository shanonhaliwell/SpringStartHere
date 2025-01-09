package springstarthere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springstarthere.model.Comment;

import springstarthere.proxies.CommentNotificationProxy;
import springstarthere.repositories.CommentRepository;

@Component
public class CommentService {

    // make instance variables not final and @Autowired
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;


    /** Spring use the default constructor to create the intance of the class
     *  and then injects the two dependencies from its context so no need to explitly write constructor here
     *  when we use @Autowired through fields
     * 
    // constructor
    @Autowired  // @Autowired can be removed here without any compilling issue
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    */

    public void publishComment(Comment comment) {

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}