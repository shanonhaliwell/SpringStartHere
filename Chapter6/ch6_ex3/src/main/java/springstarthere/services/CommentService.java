package springstarthere.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

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

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    

}