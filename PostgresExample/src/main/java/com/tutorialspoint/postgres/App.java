package com.tutorialspoint.postgres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new FileSystemXmlApplicationContext("Beans.xml");
        System.out.println( "Hello World!" );
        ConnectionDB c=(ConnectionDB) context.getBean("db");
        c.ConfigConnection();
        c.CreateT();
        c.insertO();
	  
      
    }
}
