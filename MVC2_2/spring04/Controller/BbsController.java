package com.mega.mvc38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired //싱글톤으로 만든 주소를 넣어주세요.(주입, injection),DB 갯수가 늘어나면 Autowired도 늘어나야한다!! 
	BbsDAO dao; //싱글톤으로 만들어진 !!객체의 주소!!를 넣어주세요.
	
	@RequestMapping("insert3.mega") // 이후 view로 넘어갈때 앞에 insert부분만 살리고 뒤는 버린다는 말을 깨닳음.
	public void insert(BbsVO bag) throws Exception {
		//public void login(String id, String pw, String name, String tel) {
		dao.create(bag);
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 title: " + bag.getTitle());
		System.out.println("컨트롤러에서 받은 content: " + bag.getContent());
		System.out.println("컨트롤러에서 받은 writer: " + bag.getWriter());
		
	}
}
