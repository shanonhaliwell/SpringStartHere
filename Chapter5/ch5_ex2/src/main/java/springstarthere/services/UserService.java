package springstarthere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springstarthere.repositories.CommentRepository;

@Service  // Adds the bean
public class UserService {

    // instance variable
    @Autowired  // // getBean CommentRepository: request Spring to inject a bean of type CommentRepositorygetBean CommentRepository
    private CommentRepository commentRepository;

    // getter method
    public CommentRepository getCommentRepository() {
        return this.commentRepository;
    }

}
