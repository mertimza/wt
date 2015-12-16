package com.xc.wt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;

import com.xc.wt.model.dao.TaskRepo;
import com.xc.wt.model.domain.Task;
import com.xc.wt.view.DataView;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	@Autowired
	private transient TaskRepo repo;

	@RequestMapping(method = RequestMethod.GET)
	public View findAll(final Model model) {
		model.addAttribute("data", repo.findAll());
		return new DataView();
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public View findOne(final Model model, final @PathVariable Long id) {
		model.addAttribute("data", repo.findOne(id));
		return new DataView();
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public String put(final Model model, final @RequestParam String title) {
		repo.save(new Task(title));
		return "added successfully";
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public String edit(Model model, @RequestParam Long id,
			@RequestParam String title) {
		Task task = repo.findOne(id);
		task.setTitle(title);
		repo.save(task);
		return "edited successfully";
	}
}
