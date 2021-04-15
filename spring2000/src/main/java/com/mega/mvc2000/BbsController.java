package com.mega.mvc2000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@RequestMapping("insert2.mega")
	public String insert(BbsVO bag) {
		System.out.println("��Ʈ�ѷ����� ���� id : " + bag.getId());
		System.out.println("��Ʈ�ѷ����� ���� title : " + bag.getTitle());
		System.out.println("��Ʈ�ѷ����� ���� content : " + bag.getContent());
		System.out.println("��Ʈ�ѷ����� ���� writer : " + bag.getWriter());
		
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
