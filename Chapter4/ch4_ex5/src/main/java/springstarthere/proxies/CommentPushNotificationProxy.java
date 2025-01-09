package springstarthere.proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springstarthere.model.Comment;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {

        System.out.println("Author:  " + comment.getAuthor() +
                ", sending push notification for comment:  '" + comment.getText() + " '.");
    }

}