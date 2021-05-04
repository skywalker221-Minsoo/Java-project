package com.mega.mvc2000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("insert.mega") // 이후 view로 넘어갈때 앞에 insert부분만 살리고 뒤는 버린다는 말을 깨닳음.
	public void insert(MemberVO bag, MemberDAO dao) throws Exception {
		//public void login(String id, String pw, String name, String tel) {
		dao.create(bag);
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getPw());
		System.out.println("컨트롤러에서 받은 name: " + bag.getName());
		System.out.println("컨트롤러에서 받은 tel: " + bag.getTel());
		
		boolean result = false;
		if (bag.getId().equals("root") && bag.getPw().equals("1234")) {
			result = true;
		}
	}
	
	@RequestMapping("login.mega")
	public String login(String id, String pw, String pw2) {
		System.out.println("내가 호출됨..!!");
		System.out.println("컨트롤하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		System.out.println("컨트롤러에서 받은 pw: " + pw2);
		
		boolean result = false; //로그인 처리가 안됐을때
		if (id.equals("root") && pw.equals("1234")) {
			result = true;
		}
		if (result) {
			return "ok"; //views 아래에 있는 ok.jsp를 알아서 찾는다!
		}else {
			return "no";
		}
	}
	
	@RequestMapping("delete.mega") // 이후 view로 넘어갈때 앞에 insert부분만 살리고 뒤는 버린다는 말을 깨닳음.
	public void delete(MemberVO bag, MemberDAO dao) throws Exception {
		//public void login(String id, String pw, String name, String tel) {
		dao.delete(bag);
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		
		boolean result = false;
		if (bag.getId().equals("root") && bag.getPw().equals("1234")) {
			result = true;
		}
	}
}
