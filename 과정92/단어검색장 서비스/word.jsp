<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<link rel="stylesheet" type="text/css" href="./resources/word/word.css">
<body>
    <div id="a">단어검색장</div>
    <div id="b">
        <span><a href="/hom2/allw">단어모두보기</a></span>
        <input type="text" id="text">
        <input type="button" value="검색" onclick="search()">
        <select name="select" id="select" onchange="select()">
            <option>선택</option>
            <option value="ㄱ">ㄱ</option>
            <option value="ㄴ">ㄴ</option>
            <option value="ㄷ">ㄷ</option>
            <option value="ㄹ">ㄹ</option>
            <option value="ㅁ">ㅁ</option>
            <option value="ㅂ">ㅂ</option>
            <option value="ㅅ">ㅅ</option>
        </select>
    </div>
    <div id="c">
        	<c:forEach var="word_dto" items="${wordlist}">
        		초성 : ${word_dto.initial} <br>
        		초성 : ${word_dto.word} <br>
        		명사1 : ${word_dto.nounone} <br>
        		명사2 : ${word_dto.nountwo} <br>
        	</c:forEach>
    </div>
</body>
</html>
<script>
	function search(){
		let a = document.getElementById('text').value
		location.href = "/hom2/search?wordText="+a;
	}
	function select(){
		let a = document.getElementById('select').value
		location.href = "/hom2/select?wordText="+a;
	}
	
</script>