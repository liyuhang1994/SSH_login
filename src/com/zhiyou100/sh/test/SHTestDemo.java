package com.zhiyou100.sh.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.sh.model.User;
import com.zhiyou100.sh.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-*.xml")
public class SHTestDemo {

	@Autowired
	private UserService us;
	
	@Test
	public void test01(){
		User u = new User();
		//us.addUser(u);
	}
	@Test
	public void test02(){
		User u = new User();
		u.setName("aaa");
		us.addEntity(u);
	}
	@Test
	public void test03(){
		List<User> list = us.findAllEntity();
		System.out.println(list);
	}
	@Test
	public void test04(){
		User u = new User();
		u.setId(9);
		us.deleteEntity(u);
	}
	@Test
	public void test05(){
		User u = new User();
		u.setId(8);
		u.setName("aaaaa");
		us.updateEntity(u);
	}
	
	
}
