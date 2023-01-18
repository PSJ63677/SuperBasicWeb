<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 취향 테스트(get)</title>
</head>
<body>
    <h2>개인 취향 테스트(GET)</h2>
    당신의 취향을 테스트 합니다. <br>
    데이터 입력 후 확인 버튼을 누르세요<br><br>
    <form action="/SuperBasicWeb/tasteResult.do" method="get">
    이름은? <input type="text" name="person-name">
    <br><br>
    좋아하는 색? 
    빨강 <input type="radio" name="color" value="red">
    파랑 <input type="radio" name="color" value="blue">
    노랑 <input type="radio" name="color" value="yellow">
    초록 <input type="radio" name="color" value="green">
    <br><br>
    좋아하는 동물은?
    <select name="pet" id="">
        <option value="puppy">강아지</option>
        <option value="kitty">고양이</option>
        <option value="bunny">토끼</option>
        <option value="chick">병아리</option>
    </select>
    <br><br>
    좋아하는 음식은?(모두 고르세요) 
    짜장면 <input type="checkbox" name="food" value="jja">
    짬뽕<input type="checkbox" name="food" value="jjam">
    탕수육<input type="checkbox" name="food" value="tang">
    양장피<input type="checkbox" name="food" value="yang">
    팔보채<input type="checkbox" name="food" value="pal">
    <br><br>
    <input type="submit" value="전송">
    <input type="reset" value="취소">
    </body>
    </html>