package com.cydeo.proxy;

import com.cydeo.model.Comment;

public interface CommentNotificationProxy {
    //why interface?there might be more than one implementation based on our business requirements
void sendComment(Comment comment);
}
