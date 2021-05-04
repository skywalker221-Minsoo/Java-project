<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String num = request.getParameter("num");
	String answer;
	if (num.equals("111")) {
		answer = "인증 성공";
	}
	else if (num.equals("222")) {
		answer = "인증 성공";
	}
	else if (num.equals("333")) {
		answer = "인증 성공";
	}
	else {
		answer = "인증 실패";
	}
%><%= answer %>