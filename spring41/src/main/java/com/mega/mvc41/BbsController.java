package com.mega.mvc41;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired //�̱������� ���� �ּҸ� �־��ּ���.(����, injection),DB ������ �þ�� Autowired�� �þ���Ѵ�!! 
	BbsDAO dao; //�̱������� ������� !!��ü�� �ּ�!!�� �־��ּ���.
	
	@Autowired
	BbsDAO dao2;
	
	@RequestMapping("all")
	public void all(Model model) {
		List<BbsVO> list = dao2.all();
		System.out.println("����� ���� : " + list.size() + "=========================");
		model.addAttribute("Thislist", list);
	}
	
	@RequestMapping("select")
	public void select(BbsVO bbsVO, Model model) {
		BbsVO vo = dao.read(bbsVO);
		//views���� �˻��� ������ ������ �����Ѵ�.
		//model�� �Ӽ����θ� ����ϸ� ��.
		model.addAttribute("vo", vo);
	}
	
	
	@RequestMapping("insert3.mega") // ���� view�� �Ѿ�� �տ� insert�κи� �츮�� �ڴ� �����ٴ� ���� ������.
	public void insert(BbsVO bbsVO) throws Exception {
		//bbsVO�� model�Ӽ����� �ڵ� �������.
		//model.addAttribute("bbsVO", bbsVO);
		dao.create(bbsVO);
		System.out.println("��Ʈ�ѷ����� ���� id: " + bbsVO.getId());
		System.out.println("��Ʈ�ѷ����� ���� title: " + bbsVO.getTitle());
		System.out.println("��Ʈ�ѷ����� ���� content: " + bbsVO.getContent());
		System.out.println("��Ʈ�ѷ����� ���� writer: " + bbsVO.getWriter());
		
	}
}
