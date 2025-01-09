package springstarthere.proxies;

import org.springframework.stereotype.Component;

import springstarthere.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Author  " + comment.getAuthor() + ", sending notification for comment via email  ' " + comment.getText() + " '.");
    }
}