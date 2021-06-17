<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이바티스 사용하기</title>
</head>
<body>
	<h2> 마이바티스 체험해보자!</h2>
	<a href="${path }/insertStudentTest">학생입력</a>
	<!--데이터 넘기기  -->
	<h3>학생이름 등록하기</h3>
	<form action="${path }/paramMybatis" method="post">
		<input type="text" name="name">
		<input type="submit" value="이름저장">
	</form>
	
	<h3>이메일 등록하기</h3>
	<form action="${path }/insertEmail" method="post">
		<input type="text" name="email">
		<input type="submit" value="이메일저장">
	</form>
	
	<h3>여러개의 파리미터 저장하기</h3>
	<form action="${path }/paramAll" method="post">
		이름 <input type="text" name="name">
		이메일<input type="email" name="email">
		주소<input type="text" name="addr">
		전화번호<input type="text" name="phone">
		<input type="submit" value="등록"/>
	</form>
	
	
	<h3>등록된 회원의 이름, 주소, 전화번호를 받아서 수정을 해보자</h3>
	<form action="${path }/updateStudent" method="post">
		이름 <input type="text" name="name"/>
		주소 <input type="text" name="addr"/>
		전화번호 <input type="text" name="phone"/>
		<input type= "submit" value="수정"/>
	</form>
	
	<h3>등록된 회원의 이름을 받아 삭제를 해보세요.</h3>
		<form action="${path }/deleteStudent" method="post">
		이름 <input type="text" name="name"/>
		<input type= "submit" value="삭제/">
		</form>
	<h2>db에 저장된 데이터 조회하기</h2>
	<p> select문 사용해보자 </p>
	
	<ul>
		<li>한개의 row만 가져오는 select문 구성</li>
		<li>여러개의 row들을 가져오는 select문 구성</li>
		<li>여러개의 row들을 부분별로 가져오는 select문 구성-> paging처리</li>
	</ul>
	
	<h1>기본 select문을 이용해서 데이터 가져오기</h1>
	<h3>student 테이블의 학생 수 가져오기</h3>
	<a href="${path }/selectCount">학생수 가져와</a>
	
	
	<a href="${path }/selectStudent?no=1">1번 학생 호출</a>
	
	<h3>김민주 회원님 정보 가져오기</h3>
	<form action="${path }/paramAll" method="post">
		이름 <input type="text" name="name"/>
		이메일<input type="email" name="email"/>
		주소 <input type="text" name="addr"/>
		전화번호 <input type="text"name="phone"/>
		<input type="submit" value="정보등록"/>
	</form>	
	
	<h3>student 테이블의 전체학생 가져오기</h3>
	<a href="${path }/selectStudentList">전체학생조회</a>
	
	<h2>vo객체를 이용하지 않고 Data 가져오기</h2>
	<p>
		vo객체를 MAP객체로 대체해서 DB의 데이터를 가져올 수 있음
		MAP -> kye=컬럼명 , value= 값
	</p>
	<a href="${path }/selectStudentMap?no=1">학생한명조회</a>
	<a href="${path }/selectStudentlistMap">학생전체조회</a>
	
	
	
</body>
</html>