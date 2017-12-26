package controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

	@RequestMapping("/getlogin")
	public String getlogin(){
		return "login";
	}
	@RequestMapping("/getUser")
	@ResponseBody
	public List<User> getUser(HttpServletRequest request){
		String s=request.getParameter("username");
		List<User> uList=new ArrayList<>();
		User user1=new User();
		user1.setUsername("王");
		user1.setPassword(123);
		User user2=new User();
		user2.setUsername("党");
		user2.setPassword(123);
		uList.add(user1);
		uList.add(user2);
        System.out.println(s);
		return uList;
	}
}
