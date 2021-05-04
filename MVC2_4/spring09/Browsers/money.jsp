<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String money = request.getParameter("money");
	String choice = request.getParameter("choice");
	//chlice가 1번이면 80%만 결제
	//		  2번이면 90%만 결제
	//		  3번이면 100% 결제
	//		   결제금액을 알려주세요!
	int choice2 = Integer.parseInt(choice);
	double money2 = Double.parseDouble(money);
	if (choice2 == 1) {
		money2 = money2 * 0.8;
	}
	else if (choice2 == 2) {
		money2 = money2 * 0.9;
	}
	else if (choice2 == 3) {
	}
	
	int money3 = (int)money2;
%><%= money3 %>원, 선택번호 <%= choice2 %>번