package com.mybatis.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {

	public static SqlSession getSession() {
		SqlSession session=null;
		//mybatis설정 xml을 가져옴
		String resource="/mybatis-config.xml";
		try {
			//mybatis-config.xml파일을 instream을 이용해서 가져옴
			InputStream is=Resources.getResourceAsStream(resource);
			//SqlSessionFactoryBuilder클래스를 생성
			SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
			//SqlSessionFactory클래스 생성 sfb.build(mybatis-config.xml);
			SqlSessionFactory sf=sfb.build(is);
			//SqlSession생성하기
			session=sf.openSession(false);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return session;
	}
	
	public static void getParamMap(Map<String,Object> param, Map<String,String[]> reqParam) {
		for(String key : reqParam.keySet()) {
			param.put(key, reqParam.get(key)[0]);
		}
	}
	
	
}






