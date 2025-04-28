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
<link rel="stylesheet" type="text/css" href="./resources/english/english.css">
<body>
    <div id="div1">단어공부</div>
    <div id="div2">
        <table id="table">
                <c:forEach var="word_dto" items="${words}">
            <tr id="tableTr">
                <td><input type="checkbox" name="" id="" class="chkAll"></td>
                <td class="tableTd">${word_dto.word}</td>
                <td class="tableTd">${word_dto.englishword}</td>
            </tr>
                	
                </c:forEach>
        </table>
        <div id="div4">
        	<input type="text">
        	<input type="button" value="저장" id="btn3" class="btn">
        </div>
        <div id="div3">
            <input type="button" value="삭제" id="btn1" class="btn">
            <input type="button" value="새로고침" id="btn2" class="btn">
        </div>
    </div>
</body>
</html>

<script>	
	document.getElementById('btn1').addEventListener('click',() => { 
		let table = document.getElementById('table');
		for (let i=0; i<table.rows.length; i++){
			if (table.rows[i].cells[0].childNodes[0].checked){
				table.deleteRow(i)
				i--;
			}
		}	
	})
	document.getElementById('btn2').addEventListener('click',() => { 
		location.href = "/hom2/english?"
	})

	
</script>