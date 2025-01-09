package springstarthere.services;

import springstarthere.repositories.CommentRepository;

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