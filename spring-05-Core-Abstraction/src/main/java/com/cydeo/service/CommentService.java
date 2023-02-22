package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.repository.DBCommentRepository;

public class CommentService {
private CommentRepository commentRepository;
private CommentNotificationProxy commentNotificationProxy;
    public void publishComment(Comment comment){
        //save in the database
        //send email
//to be able to call method this method belongs to class//tightly coupled call interface
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
        //why interface//maybe tomorrow not send email  I will push notification
    }

}
