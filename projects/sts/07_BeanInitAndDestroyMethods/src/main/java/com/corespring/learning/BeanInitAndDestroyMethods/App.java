package com.corespring.learning.BeanInitAndDestroyMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/corespring/learning/BeanInitAndDestroyMethods/beans/beans.xml");
		Patient patient1 = (Patient) context.getBean("patient");
		Patient patient2 = (Patient) context.getBean("patient");
		
		patient1.setName("Harry");
		
		System.out.println(patient2);

		((ClassPathXmlApplicationContext) context).close();
	}
}
