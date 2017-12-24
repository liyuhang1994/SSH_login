package com.zhiyou100.sh.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhiyou100.sh.model.User;
import com.zhiyou100.sh.service.UserService;

@Controller
@Scope(scopeName="prototype")
public class LoginAction extends ActionSupport{

	@Autowired
	private UserService us;
	
	String name;
	String pwd;
	
	public UserService getUs() {
		return us;
	}
	public void setUs(UserService us) {
		this.us = us;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	// 登录
	public String login(){
		List<User> list = us.findAllEntity();
		String str = "fail";
		for (User user : list) {
			if(user.getName().equals(name)&&user.getPwd().equals(pwd)){
				ActionContext.getContext().put("user", user);
				str = "success";
				break;
			}
		}
		return str;
	}
	// 注册
	public String register(){
		User u = new User();
		u.setName(name);
		u.setPwd(pwd);
		us.addEntity(u);
		ActionContext.getContext().put("message", "注册成功,请登录");
		return "register_success";
	}
	
}
