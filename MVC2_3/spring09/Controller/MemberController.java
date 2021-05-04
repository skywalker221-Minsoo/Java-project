package com.mega.mvc40;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //�뼱�끂�뀒�씠�뀡, �몴�떆
public class MemberController {
	
	@Autowired
	MemberDAO dao; //�떛湲��넠�쑝濡� 留뚮뱾�뼱吏� 媛앹껜�쓽 二쇱냼瑜� �꽔�뼱二쇱꽭�슂.
	
	@RequestMapping("sunday")
	public void sunday() {
		
	}
	
	@RequestMapping("insert.mega")
	public void insert(MemberVO bag) throws Exception {
		dao.create(bag);
	}
	
	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession session) {
		MemberVO vo = dao.login(bag);
		System.out.println("=============" + vo);
		if(vo != null) {
			System.out.println("�빐�떦 id/pw媛� �엳�쓬.");
			session.setAttribute("userId", vo.getId());
			return "redirect:login.jsp";
//			return "ok";
		}else {
			System.out.println("�빐�떦 id/pw媛� �뾾�쓬.");
			return "no";
		}
	}
}
