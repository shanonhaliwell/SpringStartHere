package springstarthere.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import springstarthere.aspects.ToLog;
import springstarthere.model.Comment;

@Service
public class CommentService {

    // instance variable
    //private Logger logger = Logger.getLogger(CommentService.class.getName());
    private Logger logger;

    // constructor
    public CommentService() {
        logger = Logger.getLogger(CommentService.class.getName());
    }

    // method  // need import springstarthere.model.Comment;
    public String publishComment(Comment comment) {
        logger.info("Publishing comment:  " + comment.getText());
        return "SUCCESS";
    }

    // custom annotation @ToLog for methods we want the aspect to intercept
    @ToLog // import springstarthere.aspects.ToLog;
    public String deleteComment(Comment comment) {
        logger.info("Deleting comment:  " + comment.getText());
        
        comment.setText(null);
        return comment.getText();
        
        //return null;
    }

    // setter method
    public void setLogger(Logger logger) { this.logger = logger; }
    
    public void editComment(Comment comment) {
        logger.info("Editing comment:  " +  comment.getText());
    }

}