package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.repository.DBCommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
private final CommentRepository commentRepository;//putting final is good practice->reason is that
    //you might forget creating constructor if we put final->compile error->these arent initiliazed yet
private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,@Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
     //I put the default Bean Name
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        //save in the database
        //send email
//to be able to call method this method belongs to class//tightly coupled call interface
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
        //why interface//maybe tomorrow not send email  I will push notification
    }

}
