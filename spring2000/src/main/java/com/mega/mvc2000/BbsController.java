package com.mega.mvc2000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@RequestMapping("insert2.mega")
	public String insert(BbsVO bag) {
		System.out.println("컨트롤러에서 받은 id : " + bag.getId());
		System.out.println("컨트롤러에서 받은 title : " + bag.getTitle());
		System.out.println("컨트롤러에서 받은 content : " + bag.getContent());
		System.out.println("컨트롤러에서 받은 writer : " + bag.getWriter());
		
		boolean result = false;
		if (bag.getId().equals("root") && bag.getTitle().equals("1234")) {
			result = true;
		}
		if (result) {
			return "ok";
		} else {
			return "no";
		}
	}
}
