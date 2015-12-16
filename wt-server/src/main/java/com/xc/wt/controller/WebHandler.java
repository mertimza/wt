package com.xc.wt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebHandler {
	@RequestMapping(value = "/")
	public String getRoot(Model model) {
		return "/index.html";
	}
}
