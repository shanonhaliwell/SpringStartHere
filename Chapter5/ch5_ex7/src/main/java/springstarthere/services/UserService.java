package springstarthere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springstarthere.repositories.CommentRepository;

@Service
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    // constructor
    public UserService() {
        System.out.println("UserService instance created !");
    }

    // method
    public CommentRepository getCommentRepository() {
        return this.commentRepository;
    }

}