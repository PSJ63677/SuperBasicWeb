<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관광지 선택 결과</title>
</head>
<body>
	<h1>관광지 선택 결과</h1>
	<c:forEach items="${places }" var="place">
		<span>선택한 장소는 ${place }</span>
	</c:forEach>
	입니다.
</body>
</html>