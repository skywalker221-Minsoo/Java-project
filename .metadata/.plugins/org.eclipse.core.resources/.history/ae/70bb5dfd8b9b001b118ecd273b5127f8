package com.mega.project;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 어노테이션, 표시
public class MemberController {

	@Autowired
	MemberDAO dao; // 싱글톤으로 만들어진 객체의 주소를 넣어주세요.

	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession session) {
		System.out.println("임시로그인처리");
		MemberVO vo = dao.login(bag);
		if (vo != null) {
			session.setAttribute("user_id", vo.getId());
			System.out.println("로그인 성공");
//			return "redirect:login.jsp";
			return "redirect:b_main.jsp";
//			return "b_main";
			
		} else {
			System.out.println("로그인 실패");
			return "redirect:b_login.jsp";
		}
	}
}
