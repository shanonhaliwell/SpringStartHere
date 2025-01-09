package springstarthere.repositories;

import org.springframework.stereotype.Component;

import springstarthere.model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {

        System.out.println("Author  " + comment.getAuthor() + ", storing comment  ' " + comment.getText() + " '.");
    }
}