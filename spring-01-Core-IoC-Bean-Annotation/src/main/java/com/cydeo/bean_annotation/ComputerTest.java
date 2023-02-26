package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {
        System.out.println("Creating Container");
        //Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();
        //Creating container by using Application Context
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);
//How we will tell the container which configuration file will use//add class in paranthesis conctructor
        //when you run the application-> create container it is created->we need to put the beans inside constructor
//intellij will read parameter which is  ComputerConfig.class->go to that Configuration class it will check each methods
// if you are annotated @Bean->it will just add all object in the container and it wil manage for you

 // Monitor theMonitor= container.getBean(Monitor.class);
     SonyMonitor sony= container.getBean(SonyMonitor.class);
  Case theCase=container.getBean(Case.class);
  Motherboard theMotherboard =container.getBean(Motherboard.class);
        sony.drawPixelAt();//not return type//Drawing pixel with Sony
        PC myPc=new PC(theCase,sony,theMotherboard);
      //  myPc.powerUp();
        theCase.pressPowerButton();//Power button pressed

        System.out.println("************Retrieving the beans******************");

//        Monitor theMonitor = container.getBean(Monitor.class);
//        Case theCase = container.getBean(Case.class);
//        Motherboard theMotherboard = container.getBean(Motherboard.class);
//
//        PC myPc2 = new PC(theCase,theMonitor,theMotherboard);
        System.out.println("************Multiple Objects******************");
        Monitor theMonitor2 = container.getBean("monitorSony", Monitor.class);  //DEFAULT BEAN NAME//method name
        Monitor theMonitor3 = container.getBean("acer", Monitor.class);  //CUSTOM BEAN NAME
        Monitor theMonitor4 = container.getBean( Monitor.class);  //@Primary
        System.out.println(theMonitor2);
//Monitor(model=25 inch Beast, manufacturer=Sony, size=25)
    }
}
