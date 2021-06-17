<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생조회결과</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>주소</th>
			<th>가입일</th>
		</tr>
		<tr>
			<td>${student.student_No }</td>
			<td>${student.student_Name }</td>
			<td>${student.student_Tel }</td>
			<td>${student.student_Email }</td>
			<td>${student.student_Addr }</td>
			<td>${student.student_reg_Date}</td>


		</tr>
	</table>
		
<h3>MAP출력</h3>
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>주소</th>
			<th>가입일</th>
		</tr>
		<tr>
			<td>${student.STUDENT_NO }</td>
			<td>${student.STUDENT_NAME }</td>
			<td>${student.STUDENT_TEL }</td>
			<td>${student.STUDENT_EMAIL }</td>
			<td>${student.STUDENT_ADDR }</td>
			<td>${student.REG_DATE}</td>
		</tr>
	</table>
</body>
</html>