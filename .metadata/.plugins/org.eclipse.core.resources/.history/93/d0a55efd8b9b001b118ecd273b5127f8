package com.mega.project;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // MemberDAO dao = new MemberDAO(); 한개만 객체 생성!, 싱글톤!
public class MemberDAO {

	// myBatis싱글톤 주소를 주입!
	@Autowired
	SqlSessionTemplate my;

	public MemberVO login(MemberVO bag) {
		System.out.println("MemberDAO로 잘 넘어왔음");
		return my.selectOne("Member.login", bag);
	}
}
