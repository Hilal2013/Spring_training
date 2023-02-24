package com.cydeo.service;

import com.cydeo.config.AppConfigData;
import com.cydeo.config.DBConfigData;
import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class CommentService {
private final CommentRepository commentRepository;//putting final is good practice->reason is that
    //you might forget creating constructor if we put final->compile error->these arent initiliazed yet
private final CommentNotificationProxy commentNotificationProxy;
private final AppConfigData appConfigData;//we should inject
    private final DBConfigData dbConfigData;
    public CommentService(CommentRepository commentRepository, @Qualifier("Mail") CommentNotificationProxy commentNotificationProxy, AppConfigData appConfigData, DBConfigData dbConfigData) {
     //I put the default Bean Name
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        this.appConfigData = appConfigData;
        this.dbConfigData = dbConfigData;
    }

    public void publishComment(Comment comment){
        //save in the database
        //send email
//to be able to call method this method belongs to class//tightly coupled call interface
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
        //why interface//maybe tomorrow not send email  I will push notification
    }
    public  void printConfigData(){
        //print ozzy print abc123 print url
        System.out.println(appConfigData.getUsername());//one object belongs toAppConfigData//Dependency injection
        System.out.println(appConfigData.getPassword());
        System.out.println(appConfigData.getUrl());

    }

    public void printDbConfigData(){

        System.out.println(dbConfigData.getUsername());
        System.out.println(dbConfigData.getPassword());
        System.out.println(dbConfigData.getType());
    }

}
