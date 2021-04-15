package com.mega.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao; //�̱������� ������� !!��ü�� �ּ�!!�� �־��ּ���.
	
	@Autowired
	MemberDAO dao2; //�̱������� ������� !!��ü�� �ּ�!!�� �־��ּ���.
	
	//@RequestMapping("all2")
	//public void all(Model model) {
	//	List<MemberVO> list = dao2.all();
	//	model.addAttribute("Thislist", list);
	//}
	
	
	@RequestMapping("insert2.mega") // ���� view�� �Ѿ�� �տ� insert�κи� �츮�� �ڴ� �����ٴ� ���� ������.
	public void insert(MemberVO bag) throws Exception {
		//public void login(String id, String pw, String name, String tel) {
		dao.create(bag);
		System.out.println("��Ʈ�ѷ����� ���� id: " + bag.getId());
		System.out.println("��Ʈ�ѷ����� ���� pw: " + bag.getPw());
		System.out.println("��Ʈ�ѷ����� ���� name: " + bag.getName());
		System.out.println("��Ʈ�ѷ����� ���� tel: " + bag.getTel());
		
	}
	
	@RequestMapping("select2") // ���� view�� �Ѿ�� �տ� insert�κи� �츮�� �ڴ� �����ٴ� ���� ������.
	public void select(MemberVO memberVO, Model model) {
		//public void login(String id, String pw, String name, String tel) {
		MemberVO vo = dao.read(memberVO);

		model.addAttribute("vo2", vo);
	}
	
	//���� string���� ����� �ʹٸ� views�� �������� jsp�������� ����������Ѵ�.
	//return�� ok, no�� �ٲٸ� ok.jsp, no.jsp �Ѵ� ��������־���Ѵ�!
	@RequestMapping("loginSession2")
	public void login(MemberVO bag, HttpSession session) {
		MemberVO vo = dao.login(bag);
		if(vo != null) {
			System.out.println("�ش� id/pw�� ����.");
			session.setAttribute("userId", vo.getId());
		}else {
			System.out.println("�ش� id/pw�� ����.");
		}
	}
	
	@RequestMapping("all2")
	@ResponseBody
	public List<MemberVO> all2() {
		List<MemberVO> all2 = dao.all2();
		return all2;
	}
	
//	@RequestMapping("all2")
//	@ResponseBody
//	public String all2(String food) {
//		if (food.equals("���̽�ũ��")) {
//			return "go to grocery store!";
//		}else {
//			return "go home!";
//		}
//	}
	
	
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
