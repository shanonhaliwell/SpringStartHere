package springstarthere.proxies;

import springstarthere.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Author  " + comment.getAuthor() + ", sending notification for comment via email  ' " + comment.getText() + " '.");
    }
}