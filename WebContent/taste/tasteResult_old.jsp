<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 스클립틀릿 코드 <% (JSP에서 Java를 쓸수있게 해줌)
	String name = (String)request.getAttribute("name");
	String color = (String)request.getAttribute("color");
	String pet = (String)request.getAttribute("pet");
	String [] foods = (String [])request.getAttribute("foods");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>취향 설문 결과</title>
	</head>
	<body>
		<h2>개인 취향 테스트 결과 화면</h2>
		<span><%= name %> 님의 개인 취향은</span>
		색깔은 <%= color %>색을 좋아하고, 
		동물은 <%= pet %>을 좋아하고, 
		음식은
		<% for(String food : foods) { %>
				<%=food %>,
		<% } %>을 좋아합니다.
<!--  		${requestScope.name }, ${requestScope.color }, ${requestScope.pet }, ${requestScope.foods }		-->
	</body>
</html>