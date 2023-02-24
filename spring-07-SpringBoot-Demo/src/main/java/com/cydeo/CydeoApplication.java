package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {
	ApplicationContext container = SpringApplication.run(CydeoApplication.class, args);
		//SpringApplication.run(CydeoApplication.class, args);//static method so in man method we can use

		Comment comment  = new Comment();
		comment.setAuthor("Johnson");
		comment.setText("Spring Framework");
		CommentService commentService = container.getBean(CommentService.class);
		commentService.publishComment(comment);
	//	Storing comment: Spring Framework
	//	Sending notification for comment: Spring Framework
		commentService.printConfigData();
	    //hilal
		//abc123
		//www.cydeo.com
	//	commentService.printDbConfigData();

	}


}
