<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>취향 설문 결과</title>
	</head>
	<body>
	<h2>개인 취향 테스트 결과 화면</h2>
	${name } 님의 개인 취향은 색깔은
	<c:if test="${color eq 'red' }">빨강색</c:if>
	<c:if test="${color eq 'blue' }">파랑색</c:if>
	<c:if test="${color eq 'yellow' }">노랑색</c:if>
	<c:if test="${color eq 'green' }">초록색</c:if>
	을 좋아하고
	동물은
	<c:choose>
		<c:when test="${pet eq 'puppy' }">강아지</c:when>
		<c:when test="${pet eq 'kitty' }">고양이</c:when>
		<c:when test="${pet eq 'bunny' }">토끼</c:when>
		<c:when test="${pet eq 'chick' }">병아리</c:when>
	</c:choose>
	을 좋아하고
	음식은
	<c:forEach items="${foods }" var="food">
		<c:if test="${food eq 'jja' }">짜장면,</c:if>
		<c:if test="${food eq 'jjam' }">짬뽕,</c:if>
		<c:if test="${food eq 'tang' }">탕수육,</c:if>
		<c:if test="${food eq 'yang' }">양장피,</c:if>
		<c:if test="${food eq 'pal' }">팔보채,</c:if>
	</c:forEach>
	을 좋아합니다.	
	</body>
</html>