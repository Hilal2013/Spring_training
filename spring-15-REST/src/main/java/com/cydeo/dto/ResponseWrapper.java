package com.cydeo.dto;

import org.springframework.http.HttpStatus;

public class ResponseWrapper {
    private boolean success;
    private String message;
    private Integer code;

    //dont forget data

    private Object data;
   public ResponseWrapper(String message,Object data){

      this.message=message;
      this.data=data;
       this.code= HttpStatus.OK.value();
       this.success=true;
   }
    public ResponseWrapper(String message){

        this.message=message;
        this.data=data;
        this.code= HttpStatus.OK.value();
        this.success=true;
    }
//in two different ways  with data and without data
    //if I want to delete I wont pass data//im na gonna see data in json output //for delete im gonna use this constructor

}
