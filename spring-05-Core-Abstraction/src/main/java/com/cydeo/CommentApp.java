package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(CommentConfig.class);
        //All of them my classes so I  wanna go with streotype annotation
       //which one I need to annotate with @ component
//you dont need to everything bean
Comment comment=new Comment();//in application we never do //this portion comes from or UI or saving in database we read
comment.setAuthor("Johnson");
comment.setText("Spring Framework");
     CommentService commentService=   context.getBean(CommentService.class);
     commentService.publishComment(comment);

     //Storing comment: Spring Framework
       // Sending push notification for comment:Spring Framework

    }
}
