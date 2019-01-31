package com.derry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:LiuRuidong
 * @Description:
 * @Date: Created in 11:01 2019/1/30
 * @Modified By:
 */

@Component
public class BookImpl implements Ibook {

	@Override
	public String buyBook(String name, String book) {
		System.out.println(name+"买了一本"+book);
		return "success";
	}
}
