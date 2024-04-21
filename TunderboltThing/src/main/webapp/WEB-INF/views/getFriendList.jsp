<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>친구목록</title>
</head>
<body>
	<h1>친구 리스트</h1>	
	<br><br>	
	<form action="getFriendList.do" method="get">
			<select name="searchCondition">
				<option value=user_no>회원번호</option>											
				<option value='nickname'>닉네임</option>												
			</select> 
			<input name="searchKeyword" type="text" /> 
			<input type="submit" value="검색"/>
	</form>
	<br><br>
<%--   	<table border="1">
			<tr>
				<th bgcolor="orange" width="100">회원번호</th>
				<th bgcolor="orange" width="200">아이디</th>
				<th bgcolor="orange" width="150">닉네임</th>
			</tr>
			<!-- JSTL : 자바 서버 페이지 표준 태그 라이브러리 
				view페이지에 for if문등을 제공해주는 라이브러리
			-->
			<c:forEach items="${friendList}" >
				<tr>
					<td>${friendList.use_no}</td>
					<td align="left"><a href="getFriend.do?seq=${friendList.use_no}">
							${friendList.id}</a></td>
					<td>${friendList.nickname}</td>
				</tr>
			</c:forEach>
		</table>  --%>
		${friendList}

<!-- 페이징 -->
<%-- 		<br>
		${totalPageCnt}
		<br>
		<c:forEach var="idx" begin="1" end="${totalPageCnt }">
			<a href="getBoardList.do?pageNum=${idx}">[${idx }]</a>
		</c:forEach> --%>
		
		
</body>
</html>