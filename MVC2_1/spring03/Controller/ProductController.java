package com.mega.mvc37;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired //�̱����� ���� ���� Autowired ȣ��. ���� DB������ �� �þ�� Autowired �߰�!
	ProductDAO dao; //�� DB�� �´� DAO�� ������־�� ��. �ٸ� DB��� �ٸ� DB�� ���� DAO
	
	@RequestMapping("insert11.mega") //product_insert.jsp�� Mapping
	public void insert(ProductVO bag) throws Exception {
		dao.create(bag);
	}	
}
