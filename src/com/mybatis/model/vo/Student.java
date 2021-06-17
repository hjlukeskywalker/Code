package com.mybatis.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data//getter, setter, 기본생성자, toString, hashcode, equals오버라이딩까지처리
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	private int studentNo;
	private String studentName;
	private String studentTel;
	private String studentEmail;
	private String studentAddr;
	private Date regDate;
	
	
}

