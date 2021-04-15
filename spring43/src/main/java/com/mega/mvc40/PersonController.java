package com.mega.mvc40;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
	
	@Autowired
	PersonDAO dao;
	
	@RequestMapping("insertperson")
	public void insert(PersonVO bag) throws Exception {
		dao.create(bag);
	}
	
}
