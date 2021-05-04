<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String ans= "";

	String[] user = {"root", "apple", "banana", "kiwi"};
	
	for (int i=0; i < user.length; i++) {
		if (id.equals(user[i])) {
			ans = "중복된 ID입니다.";
			break;
		}
		else {
			ans = "사용 가능한 ID입니다.";
		}
	}
%><%= ans %>