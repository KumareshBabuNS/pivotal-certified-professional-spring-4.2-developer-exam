package com.corespring.learning.BeanProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context=new ClassPathXmlApplicationContext("com/corespring/learning/BeanProperties/beans/beans.xml");
         Patient patient=(Patient)context.getBean("patient");
         patient.speak();
         
         System.out.println(patient);
         
         ((ClassPathXmlApplicationContext)context).close();
    }
}
