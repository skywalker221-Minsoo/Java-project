package com.mega.mvc39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao; // �̱������� ������� !!��ü�� �ּ�!!�� �־��ּ���.

	@RequestMapping("insert4") // ���� view�� �Ѿ�� �տ� insert�κи� �츮�� �ڴ� �����ٴ� ���� ������.
	public void insert(ProductVO bag) throws Exception {
		// public void login(String id, String pw, String name, String tel) {
		dao.create(bag);

	}

	@RequestMapping("select4") // ���� view�� �Ѿ�� �տ� insert�κи� �츮�� �ڴ� �����ٴ� ���� ������.
	public void select(ProductVO productVO, Model model) {
		// public void login(String id, String pw, String name, String tel) {
		ProductVO vo = dao.read(productVO);

		model.addAttribute("vo3", vo);
	}


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
