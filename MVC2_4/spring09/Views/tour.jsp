<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- jstl: java standard tag library: 자바문법을 JSP에서 쓸수있는 태그 문법 -->
<c:forEach var="x" items="${tour}">
- ${x} <br>
</c:forEach>
<fmt:formatNumber value="1234.1234545" pattern="#.##"/> <!-- 이런것도 있다. -->
