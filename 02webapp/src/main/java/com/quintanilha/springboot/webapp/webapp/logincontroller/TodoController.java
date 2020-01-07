package com.quintanilha.springboot.webapp.webapp.logincontroller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.quintanilha.springboot.webapp.webapp.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	// Model - used to pass data from Controller to view (j s p)
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method= RequestMethod.GET)
	public String showTodosList(ModelMap model) {
		String name = (String) model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo", method= RequestMethod.GET)
	public String showAddTodos(ModelMap model) {
		return "todo";
	}
	
	@RequestMapping(value="/delete-todo", method= RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		service.deleteTodo(id);
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/add-todo", method= RequestMethod.POST)
	public String addTodos(ModelMap model, @RequestParam String desc) {
		service.addTodo((String) model.get("name"), desc, new Date(), false);
		return "redirect:/list-todos";
	}

}
