package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.vo.Student;

public class MybatisDao {

	public int insertStudent(SqlSession session) {
		//session이 제공하는 sql실행 매소드를 호출하면 끝!
		//mapper선택하기 -> namspace명.태그(insert,update,delete,select)의 id값
//		int result=session.insert("student.insertStudent");
//		return result;
		return session.insert("student.insertStudent");
	}
	
	public int insertStudentName(SqlSession session, String name) {
		return session.insert("student.insertStudentName",name);
	}
	
	public int insertStudentEmail(SqlSession session, String email) {
		return session.insert("student.insertStudentEmail",email);
	}
	
	
	public int insertParamAll(SqlSession session, Student s) {
		return session.insert("student.insertParamAll",s);
	}
	public int insertParamMap(SqlSession session, Map<String,String> param) {
		return session.insert("student.insertParamMap",param);
	}
	
	public int updateStudent(SqlSession session, Student s) {
		return session.update("student.updateStudent",s);
	}
	public int deleteStudent(SqlSession session, String name) {
		return session.delete("student.deleteStudent",name);
	}
	
	
	public int selectCount(SqlSession session) {
		//select문을 실행한 결과가 1개 row만 가져올 경우(MAX) -> selectOne()매소드 이용
		// -> 사용자가 지정한 반환타입으로 반환
		//select문을 실행한 결과가 2개 이상일 경우(MAX) -> selectList()매소드를 이용
		// -> List<클래스명>로 반환을 함. 단 제네릭 타입을 정할 수 있음
		return session.selectOne("student.selectCount");
	}
	
	
	public Student selectStudent(SqlSession session, int no) {
		return session.selectOne("student.selectStudent",no);
	}
	
	public List<Student> selectStudentList(SqlSession session){
		return session.selectList("student.selectStudentList");
	}
	
	public List<Student> searchStudent(SqlSession session,String email){
		return session.selectList("student.searchStudent", email);
	}
	
	public Map selectStudentMap(SqlSession session, int no) {
		return session.selectOne("student.selectStudentMap",no);
	}
}






