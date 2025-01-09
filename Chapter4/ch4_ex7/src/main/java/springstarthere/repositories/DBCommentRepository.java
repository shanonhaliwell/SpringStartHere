package springstarthere.repositories;

import org.springframework.stereotype.Repository;

import springstarthere.model.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {

        System.out.println("Author  " + comment.getAuthor() + ", storing comment  ' " + comment.getText() + " '.");
    }
}