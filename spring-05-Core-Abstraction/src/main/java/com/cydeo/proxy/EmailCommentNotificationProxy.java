package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    //it is eligible to get component yes->ask this class has a dependency
    //second ask is this class injected somewhere //other class requires this class?Yes=>@component
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "+comment.getText());
    }
}
