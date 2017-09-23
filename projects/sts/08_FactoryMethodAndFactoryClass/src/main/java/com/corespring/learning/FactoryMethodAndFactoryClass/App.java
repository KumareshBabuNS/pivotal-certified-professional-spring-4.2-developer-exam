package com.corespring.learning.FactoryMethodAndFactoryClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/corespring/learning/FactoryMethodAndFactoryClass/beans/beans.xml");
		Patient patient = (Patient) context.getBean("patient");

		System.out.println(patient);

		((ClassPathXmlApplicationContext) context).close();
	}
}
