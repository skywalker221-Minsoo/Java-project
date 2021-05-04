<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String tel = request.getParameter("tel");
	String tel2 = tel.substring(0, 3);
	Random r = new Random();
	int num = r.nextInt(899999) + 100000;
/* 	if (tel2.equals("010")) {
		tel = "111";
	}
	else if (tel.equals("011")) {
		tel = "222";
	}
	else if (tel.equals("019")) {
		tel = "333";
	} */
	
%>인증받은 번호==> <%= num %>