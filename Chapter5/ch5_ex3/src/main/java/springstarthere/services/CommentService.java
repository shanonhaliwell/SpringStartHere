package springstarthere.services;

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

    // constructor
    public CommentService() {
        System.out.println("CommentService instance created !");
    }

}