package com.mega.mvc37;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired //싱글톤을 쓰기 위한 Autowired 호출. 만약 DB갯수가 더 늘어나면 Autowired 추가!
	ProductDAO dao; //각 DB에 맞는 DAO를 사용해주어야 함. 다른 DB라면 다른 DB에 대한 DAO
	
	@RequestMapping("insert11.mega") //product_insert.jsp와 Mapping
	public void insert(ProductVO bag) throws Exception {
		dao.create(bag);
	}	
}
