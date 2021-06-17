package com.mybatis.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.service.MybatisService;
import com.mybatis.model.vo.Student;

/**
 * Servlet implementation class MybatisParamAllServlet
 */
@WebServlet("/paramAll")
public class MybatisParamAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MybatisParamAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String addr=request.getParameter("addr");
		
		Student s=new Student();
		s.setStudentName(name);
		s.setStudentEmail(email);
		s.setStudentTel(phone);
		s.setStudentAddr(addr);
		
//		s=Student.builder().studentName(name)
//				.studentEmail(email).build();
		Map<String,String[]> param=request.getParameterMap();
		
		Map<String,String> param2=new HashMap();
		
		for(String key : param.keySet()) {
//		param2.put("name", param.get("name")[0]);
//		param2.put("phone", param.get("phone")[0]);
//		param2.put("email", param.get("email")[0]);
			param2.put(key, param.get(key)[0]);
		};
		
		
		//mybatis데이터 전송
//		response.getWriter()
//		.append(new MybatisService().insertParamAll(s)>0?"success":"fail");
		
		response.getWriter()
		.append(new MybatisService().insertParamMap(param2)>0?"success":"fail");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
