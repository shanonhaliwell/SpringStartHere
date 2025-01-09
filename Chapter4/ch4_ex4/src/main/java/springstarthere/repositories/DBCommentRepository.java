package springstarthere.repositories;

import springstarthere.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {

        System.out.println("Author  " + comment.getAuthor() + ", storing comment  ' " + comment.getText() + " '.");
    }
}