package springstarthere.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import springstarthere.model.Comment;
import springstarthere.repositories.CommentRepository;


@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    // instance variables
    private Comment comment;
    @Autowired
    private CommentRepository commentRepository;

    // constructor
    public CommentProcessor() {}

    // method
    public void processComment(Comment comment) {
        System.out.println("Processing comment ....");
    }

    public void validateComment(Comment comment) {
        System.out.println("Validating comment ....");
    }

    // setter
    public void setComment(Comment comment) {
        System.out.println("Setting comment ....");
        this.comment = comment;
    }

    // getter
    public Comment getComment() {
        return this.comment;
    }

}