package com.mega.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BBSController {
	
	@Autowired
	BBSDAO dao; //�̱������� ������� !!��ü�� �ּ�!!�� �־��ּ���.
	
	@Autowired
	BBSDAO dao2; //�̱������� ������� !!��ü�� �ּ�!!�� �־��ּ���.
	
	//@RequestMapping("all2")
	//public void all(Model model) {
	//	List<MemberVO> list = dao2.all();
	//	model.addAttribute("Thislist", list);
	//}
	

	@RequestMapping("all3")
	@ResponseBody
	public List<BBSVO> all2() {
		List<BBSVO> all3 = dao.all2();
		return all3;
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
