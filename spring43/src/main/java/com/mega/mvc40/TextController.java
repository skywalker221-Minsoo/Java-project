package com.mega.mvc40;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextController {
	
	@Autowired
	TextService text;
	
	@RequestMapping("text")
	public void text(String tel, Model model) {
		//String tel = request.getParameter("tel");
		System.out.println("��Ʈ�ѷ����� ��û��.");
		int num2 = text.text(tel);
		model.addAttribute("num2", num2);
	}
}
