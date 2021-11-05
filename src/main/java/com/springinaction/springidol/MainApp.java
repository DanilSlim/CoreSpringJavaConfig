package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
         ApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
		
		Performer performer=(Performer) context.getBean("duke");
		
		performer.perform();
		
		performer=(Performer) context.getBean("duke25");
		
		performer.perform();
		
		performer=(Performer) context.getBean("poeticDuke");
		
		performer.perform();

	}
   
}
