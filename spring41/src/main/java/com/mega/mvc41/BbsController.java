package com.mega.mvc41;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired //싱글톤으로 만든 주소를 넣어주세요.(주입, injection),DB 갯수가 늘어나면 Autowired도 늘어나야한다!! 
	BbsDAO dao; //싱글톤으로 만들어진 !!객체의 주소!!를 넣어주세요.
	
	@Autowired
	BbsDAO dao2;
	
	@RequestMapping("all")
	public void all(Model model) {
		List<BbsVO> list = dao2.all();
		System.out.println("목록의 갯수 : " + list.size() + "=========================");
		model.addAttribute("Thislist", list);
	}
	
	@RequestMapping("select")
	public void select(BbsVO bbsVO, Model model) {
		BbsVO vo = dao.read(bbsVO);
		//views까지 검색된 정보를 가지고 가야한다.
		//model의 속성으로만 등록하면 됨.
		model.addAttribute("vo", vo);
	}
	
	
	@RequestMapping("insert3.mega") // 이후 view로 넘어갈때 앞에 insert부분만 살리고 뒤는 버린다는 말을 깨닳음.
	public void insert(BbsVO bbsVO) throws Exception {
		//bbsVO를 model속성으로 자동 등록해줌.
		//model.addAttribute("bbsVO", bbsVO);
		dao.create(bbsVO);
		System.out.println("컨트롤러에서 받은 id: " + bbsVO.getId());
		System.out.println("컨트롤러에서 받은 title: " + bbsVO.getTitle());
		System.out.println("컨트롤러에서 받은 content: " + bbsVO.getContent());
		System.out.println("컨트롤러에서 받은 writer: " + bbsVO.getWriter());
		
	}
}
