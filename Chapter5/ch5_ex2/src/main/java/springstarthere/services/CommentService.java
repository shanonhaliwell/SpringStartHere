package springstarthere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springstarthere.repositories.CommentRepository;

@Service  // Adds the bean
public class CommentService {

    /*
    //instance variable
    @Autowired  // getBean CommentRepository: request Spring to inject a bean of type CommentRepository
    private CommentRepository commentRepository;
    */

    // instance variable
    private final CommentRepository commentRepository;

    // constructor
    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    // getter method
    public CommentRepository getCommentRepository() {
        return this.commentRepository;
    }

}