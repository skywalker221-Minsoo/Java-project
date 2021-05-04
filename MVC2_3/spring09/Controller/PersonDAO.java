package com.mega.mvc40;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void create(PersonVO bag) throws Exception {
		my.insert("person.insert", bag);
	}
}
