package com.mega.mvc40;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieService movie;
	
	@RequestMapping("title")
	public void infrom(String fee, String title, Model model) {
		System.out.println("컨트롤러까지 요청됨.");
		String subject = movie.title(title); 
		int tax = movie.fee(fee);
		model.addAttribute("title", subject);
		model.addAttribute("tax", tax);
	}
}
