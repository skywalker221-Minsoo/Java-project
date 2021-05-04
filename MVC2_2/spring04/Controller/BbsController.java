package com.mega.mvc38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired //�̱������� ���� �ּҸ� �־��ּ���.(����, injection),DB ������ �þ�� Autowired�� �þ���Ѵ�!! 
	BbsDAO dao; //�̱������� ������� !!��ü�� �ּ�!!�� �־��ּ���.
	
	@RequestMapping("insert3.mega") // ���� view�� �Ѿ�� �տ� insert�κи� �츮�� �ڴ� �����ٴ� ���� ������.
	public void insert(BbsVO bag) throws Exception {
		//public void login(String id, String pw, String name, String tel) {
		dao.create(bag);
		System.out.println("��Ʈ�ѷ����� ���� id: " + bag.getId());
		System.out.println("��Ʈ�ѷ����� ���� title: " + bag.getTitle());
		System.out.println("��Ʈ�ѷ����� ���� content: " + bag.getContent());
		System.out.println("��Ʈ�ѷ����� ���� writer: " + bag.getWriter());
		
	}
}
