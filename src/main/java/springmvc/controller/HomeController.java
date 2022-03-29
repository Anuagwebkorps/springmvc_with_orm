package springmvc.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name", "I am home");
		System.out.println("this is home url");
		return "home";
	}
	
	@RequestMapping("/mark")
	public String mark(Model model)
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(77);
		list.add(99);
		list.add(30);
		model.addAttribute("marks",list);
		return "mark";
	}
}
