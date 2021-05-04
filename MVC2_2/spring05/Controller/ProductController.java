package com.mega.mvc39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao; // 싱글톤으로 만들어진 !!객체의 주소!!를 넣어주세요.

	@RequestMapping("insert4") // 이후 view로 넘어갈때 앞에 insert부분만 살리고 뒤는 버린다는 말을 깨닳음.
	public void insert(ProductVO bag) throws Exception {
		// public void login(String id, String pw, String name, String tel) {
		dao.create(bag);

	}

	@RequestMapping("select4") // 이후 view로 넘어갈때 앞에 insert부분만 살리고 뒤는 버린다는 말을 깨닳음.
	public void select(ProductVO productVO, Model model) {
		// public void login(String id, String pw, String name, String tel) {
		ProductVO vo = dao.read(productVO);

		model.addAttribute("vo3", vo);
	}


	/*
	 * @RequestMapping("delete.mega") // 이후 view로 넘어갈때 앞에 insert부분만 살리고 뒤는 버린다는 말을
	 * 깨닳음. public void delete(MemberVO bag, MemberDAO dao) throws Exception {
	 * //public void login(String id, String pw, String name, String tel) {
	 * dao.delete(bag); System.out.println("컨트롤러에서 받은 id: " + bag.getId());
	 * 
	 * boolean result = false; if (bag.getId().equals("root") &&
	 * bag.getPw().equals("1234")) { result = true; } }
	 */
}
