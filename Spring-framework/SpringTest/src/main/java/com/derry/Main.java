package com.derry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author:LiuRuidong
 * @Description:
 * @Date: Created in 11:20 2019/1/30
 * @Modified By:
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("SpringTest/src/main/resources/spring.xml");
		Ibook book = (Ibook) applicationContext.getBean("book");
		book.buyBook("Jean","《spring技术内幕》");
	}
}
