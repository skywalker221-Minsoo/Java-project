package com.mega.mvc40;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {
	//Plain Old Java Object: POJO
	//����� �������� ���� �ڹ� ��ü

	
	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("���");
		fruit.add("�ٳ���");
		fruit.add("�޷�");
		fruit.add("����");
		fruit.add("����");
		model.addAttribute("fruit", fruit);
	}
	
	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> tour = new ArrayList<String>();
		tour.add("���ֵ�");
		tour.add("�̱� ����");
		tour.add("�̱� ����");
		tour.add("ȫ��");
		tour.add("��â");
		model.addAttribute("tour", tour);
	}
}
