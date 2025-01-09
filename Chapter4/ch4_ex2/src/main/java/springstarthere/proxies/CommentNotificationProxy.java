package springstarthere.proxies;

import springstarthere.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}