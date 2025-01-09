package springstarthere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import springstarthere.processors.CommentProcessor;
import springstarthere.repositories.CommentRepository;
import springstarthere.model.Comment;


@Service
public class CommentService {

    /*
    // Dynamically Bean Retrieval  using  ApplicationContext
    @Autowired
    private ApplicationContext context;

    public CommentProcessor sendComment(Comment comment) {
    
        System.out.println("Dynamically Bean Retrieval  using  ApplicationContext\n");

        CommentProcessor processor = context.getBean(CommentProcessor.class);

        System.out.println("CommentProcessor processor = context.getBean(CommentProcessor.class);");

        //CommentProcessor processor = new CommentProcessor();

        processor.setComment(comment);
        processor.processComment(comment);
        processor.validateComment(comment);

        // get the modified Comment instance and uses it further
        comment = processor.getComment();

        System.out.println("sendComment() method ending \n\n");

        return processor;

    }
    */

    
    
    /** Chapter 5 page 118
     * DO NOT make a mistake of injecting ComentProcessor directly in the CommentService bean
     * The CommentService bean is SINGLETON, which means that Spring creates only an instance of this class
     * As a consequence, Spring will also inject the dependencies of this class just once when it creates the CommentService bean itself.
     * In this case, you’ll end up with only an instance of the CommentProcessor. 
     * Each call of the sendComment() method will use this unique instance.
     */
    
    @Autowired  // Direct Bean Injection using  @Autowired
    private CommentProcessor processor;

    public CommentProcessor sendComment(Comment comment) {
        
        //CommentProcessor processor = new CommentProcessor();

        System.out.println("Direct Bean Injection using  @Autowired\n");
        System.out.println("@Autowired  --> private CommentProcessor processor;");

        processor.setComment(comment);
        processor.processComment(comment);
        processor.validateComment(comment);

        // get the modified Comment instance and uses it further
        comment = processor.getComment();

        System.out.println("sendComment() method ending \n\n");

        return processor;

    }
    

}