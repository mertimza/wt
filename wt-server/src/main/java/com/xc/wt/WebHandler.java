package com.xc.wt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebHandler {
	@RequestMapping("/")
	public String getRoot(Model model) {
		model.addAttribute("message", "Hello World!");
		System.out.println("what");
		return "hello";
	}
}
