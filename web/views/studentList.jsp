<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학생조회</h2>
	<form action="${path }/searchStudent" method="post">
		<input type="text" name="email">
		<input type="submit" value="조회">
	</form>
	<h4>학생조회결과</h4>
		<table>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th>주소</th>
				<th>등록일</th>
			</tr>
			<c:if test='${not empty list }'>
				<c:forEach var="s" items="${list }">
					<tr>
						<td><c:out value="${s.studentNo }"/></td>
						<td><c:out value="${s.studentName }"/></td>
						<td><c:out value="${s.studentTel }"/></td>
						<td><c:out value="${s.studentEmail }"/></td>
						<td><c:out value="${s.studentAddr }"/></td>
						<td><c:out value="${s.regDate }"/></td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
</body>
</html>