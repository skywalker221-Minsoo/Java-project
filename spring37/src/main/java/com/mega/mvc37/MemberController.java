package com.mega.mvc37;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao; //�̱������� ������� !!��ü�� �ּ�!!�� �־��ּ���.
	
	@RequestMapping("insert2.mega") // ���� view�� �Ѿ�� �տ� insert�κи� �츮�� �ڴ� �����ٴ� ���� ������.
	public void insert(MemberVO bag) throws Exception {
		//public void login(String id, String pw, String name, String tel) {
		dao.create(bag);
		System.out.println("��Ʈ�ѷ����� ���� id: " + bag.getId());
		System.out.println("��Ʈ�ѷ����� ���� pw: " + bag.getPw());
		System.out.println("��Ʈ�ѷ����� ���� name: " + bag.getName());
		System.out.println("��Ʈ�ѷ����� ���� tel: " + bag.getTel());
		
	}
	
	/*
	 * @RequestMapping("login.mega") public String login(String id, String pw,
	 * String pw2) { System.out.println("���� ȣ���..!!");
	 * System.out.println("��Ʈ���ϴ� �޼���"); System.out.println("��Ʈ�ѷ����� ���� id: " + id);
	 * System.out.println("��Ʈ�ѷ����� ���� pw: " + pw);
	 * System.out.println("��Ʈ�ѷ����� ���� pw: " + pw2);
	 * 
	 * boolean result = false; //�α��� ó���� �ȵ����� if (id.equals("root") &&
	 * pw.equals("1234")) { result = true; } if (result) { return "ok"; //views �Ʒ���
	 * �ִ� ok.jsp�� �˾Ƽ� ã�´�! }else { return "no"; } }
	 */
	
	/*
	 * @RequestMapping("delete.mega") // ���� view�� �Ѿ�� �տ� insert�κи� �츮�� �ڴ� �����ٴ� ����
	 * ������. public void delete(MemberVO bag, MemberDAO dao) throws Exception {
	 * //public void login(String id, String pw, String name, String tel) {
	 * dao.delete(bag); System.out.println("��Ʈ�ѷ����� ���� id: " + bag.getId());
	 * 
	 * boolean result = false; if (bag.getId().equals("root") &&
	 * bag.getPw().equals("1234")) { result = true; } }
	 */
}
