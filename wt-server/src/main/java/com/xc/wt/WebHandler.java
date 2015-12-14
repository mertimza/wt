package com.xc.wt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebHandler {
	@RequestMapping(value = "/x")
	public String getRoot(Model model) {
		return "/x/index.html";
	}
}
