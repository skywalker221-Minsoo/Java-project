  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 서버에서 실행되는 코드가 필요 -->
    <!-- 클라이언트가 입력한 정보를 받아주는 코드가 필요 -->
    <% 
    // 클라이언트가 입력한 정보를 서버에서 받아주는 클래스
    // HttpServletRequest request = new HttpServletRequest(); 자바에선 이래야하는데
    
    String id = request.getParameter("id"); // t1.gettext(); 과 동일하다.
    String pw = request.getParameter("pw"); // t1.gettext(); 과 동일하다.
    String name = request.getParameter("name"); // t1.gettext(); 과 동일하다.
    String tel = request.getParameter("tel"); // t1.gettext(); 과 동일하다.
    
    /* db에 넣을 수 있는 부품을 만들어서 데이터를 주어서 넣으라고 하는 처리 */
    %>    
    
    <!-- html은 요청한 처리 결과를 클라이언트에게 알려주기 위한 html화면
    	 => html부분이 클라이언트로 전송되고 끝남. -->

    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
나는 회원가입 후 브라우저에 보여지는 부분..!~!
<h3>회원가입이 잘 되었습니다.</h3>
<hr>
당신이 입력한 id : <%=id%> <br>
당신이 입력한 pw : <%=pw%>  <br>
당신이 입력한 name : <%=name%>  <br>
당신이 입력한 tel : <%=tel%>  <br>

<a href="member.html">회원가입화면으로</a>
</body>
</html>