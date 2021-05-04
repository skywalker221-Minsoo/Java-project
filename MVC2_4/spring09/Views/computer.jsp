<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="1">
   <tr>
      <td style="background:yellow; font-size: 20px; width: 150px; height: 50px;">항목명</td>
      <td style="background:yellow; font-size: 20px; width: 150px; height: 50px;">가격</td>
   </tr>
   <tr>
      <td style="background:pink; font-size: 20px; width: 150px; height: 50px;">${vo.comi}</td>
      <td style="background:pink; font-size: 20px; width: 150px; height: 50px;">${vo.comp}</td>
   </tr>
   <tr>
      <td style="background:pink; font-size: 20px; width: 150px; height: 50px;">${vo.moui}</td>
      <td style="background:pink; font-size: 20px; width: 150px; height: 50px;">${vo.moup}</td>
   </tr>
   <tr>
      <td style="background:green; font-size: 20px; width: 150px; height: 50px">총계</td>
      <td style="background:green; font-size: 20px; width: 150px; height: 50px">${sum}</td>
   </tr>
   <a href="ajax3.jsp">문자인증받기</a>
</table>