package springstarthere.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import springstarthere.model.Comment;

@Component
@Qualifier("Push")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {

        System.out.println("Author:  " + comment.getAuthor() +
                ", sending push notification for comment:  '" + comment.getText() + " '.");
    }

}