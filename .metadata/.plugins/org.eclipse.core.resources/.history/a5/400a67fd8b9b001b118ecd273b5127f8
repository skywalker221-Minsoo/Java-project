package com.mega.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class BoardController {

	@Autowired
	BoardDAO dao;
	@Autowired
	LikeDAO dao2;

	@RequestMapping("b_write") // 주소배정
	public void insert(BoardVO vo) throws Exception {

		dao.create(vo);
		System.out.println("Board VO값 전달 성공");

	}

	@RequestMapping("b_update") // 주소배정
	public void update(BoardVO vo) throws Exception {

		dao.update(vo);
		System.out.println("Board VO값 전달 성공");

	}
	@RequestMapping("b_read")
	public void select(BoardVO boardVO, Model model) throws Exception {

		BoardVO vo = dao.read(boardVO);
		// view 까지 검색된 정보를 가지고 가야한다.
		// model의 속성으로만 등록하면 됨.
		System.out.println("Board VO값 전달 성공");
		model.addAttribute("vo2", vo);
	}
	
	@RequestMapping("b_main")
	public void all(BoardVO vo, Model model) {
		
		List<BoardVO> list = dao.all();
		System.out.println("목록의 개수 : " + list.size());
		System.out.println("Board VO값 전달 성공");
		model.addAttribute("list", list);
	}
	
	@RequestMapping("b_likecount")
	public void likecount(BoardVO vo, Model model) {
		
		int blike = dao.likecount(vo);
		System.out.println("Board 에서 좋아요 값 가져왔음");
		model.addAttribute("blike", blike);
	}
	
	@RequestMapping("b_search")
	public void search(SearchVO vo,Model model) {
		System.out.println(vo.getS_field());
		System.out.println(vo.getS_word());
		System.out.println("검색필드와 검색어 가지고 컨트롤러 도착");
		List<BoardVO> list = dao.search(vo);
		System.out.println("검색된 게시글 개수 : " + list.size());
		System.out.println("Mapper 실행되서 DAO 지나쳐 컨트롤러 다시 도착");
		model.addAttribute("s_title", list);
	}
	
}
