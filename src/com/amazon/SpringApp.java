package com.amazon;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApp {
	
	public static void main(String[] args) {
		BeanFactory factory = new FileSystemXmlApplicationContext("C:\\Users\\Admin\\eclipse-workspace\\dependency-injection\\beans.xml");
		
		Product p1 =(Product) factory.getBean("iphone15");
		System.out.println(p1);
		
		System.out.println(p1.getPrice());
		System.out.println(p1.getProductId());
		System.out.println(p1.getProductName());
		System.out.println(p1.isExpired());
		System.out.println(p1.getProducts());
//		
		
		
		System.out.println("****p2*********");
		Product p2 =(Product) factory.getBean("iphone2");
		System.out.println(p2.getProductId());
//		
	}

}
 