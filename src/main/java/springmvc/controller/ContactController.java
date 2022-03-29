package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.model.User1;

import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
  private UserService userService;
    
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	@RequestMapping("/myform")
	public String adminLogin(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("pwd") String pwd,Model m)
	{
		if(id.equals("admin")&&pwd.equals("123"))
		{
			String msg="Hello:"+name;
			m.addAttribute("message",msg);
			 return "welcome"; //these are jsp pages
		}
		else{
			return "error"; //these are jsp pages
		}
	}
	@RequestMapping("/processform")
	 public String handleform(@ModelAttribute User1 user1,Model model)
	 {
		System.out.println(user1);
		this.userService.CreateUser(user1);
		return "User1";
//@ModelAttribute se code or chota ho jaye ga hume @RequestParam ,m.addAttribute use bhi nahi kerna padega bus class bano or uska field	
	 }
	@RequestMapping("/del")
	 public String deleteStudent(@ModelAttribute User1 user1,Model model)
	 {
		System.out.println("user deleted...");
		this.userService.DelUser(user1);
		return "";
	 }
	
	
	
	
}
