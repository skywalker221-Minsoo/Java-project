package com.mega.mvc40;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComputerController {
	
	@Autowired
	MovieService movie;
	
	@RequestMapping("computer")
	public void infrom(ComputerVO vo, Model model) {
		System.out.println("컨트롤러까지 요청됨.");
		
		model.addAttribute("vo", vo);
		int comp2 = Integer.parseInt(vo.comp);
		int moup2 = Integer.parseInt(vo.moup);
		model.addAttribute("sum", comp2 + moup2);
	}
}
