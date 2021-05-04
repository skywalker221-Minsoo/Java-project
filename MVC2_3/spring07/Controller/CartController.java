package com.mega.mvc400;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CartController {
	@Autowired
	CartDAO dao;
	
	@RequestMapping("cart")
	public void insert(CartVO bag) throws Exception {
		dao.create(bag);
	}	
}
