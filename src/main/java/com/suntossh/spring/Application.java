package com.suntossh.spring;

import java.util.Enumeration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		BeanA beanA = context.getBean("beanAID", BeanA.class);
		
		System.out.println("\n\nLIST\n");
		/*for(String listString: beanA.getMyList()){
			System.out.println(listString);
		}*/
		
		for(BeanB beanB: beanA.getMyList()){
			System.out.println(beanB);
		}
		System.out.println("\n\nSET\n");
		for(String setString: beanA.getMySet()){
			System.out.println(setString);
		}
		
		System.out.println("\n\n MAP\n");
		for(String mapskeySetString: beanA.getMyMap().keySet()){
			System.out.println(mapskeySetString);
		}
		for(String mapValuesString: beanA.getMyMap().values()){
			System.out.println(mapValuesString);
		}
		
		System.out.println("\n\n PROP\n");
		System.out.println(beanA.getMyProp()); 
		for(Object propKeyObject: beanA.getMyProp().keySet()){
			System.out.println(beanA.getMyProp().getProperty((String)propKeyObject));
		}
		
	}
	
}
