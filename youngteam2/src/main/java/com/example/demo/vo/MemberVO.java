package com.example.demo.vo;

import lombok.Data;

@Data
public class MemberVO {
	
	private String userid;
	private String userpwd;
	private String name;
	private String uphone1;
	private String uphone2;
	private String uphone3;
	private String phone1;
	private String phone2;
	private String phone3;
	private String email;
	private String email2;
	private String zipcode;
	private String address;
	private String address2;
	private int auth;
	private String joindate;
	private int ustate; //가입회원1, 탈퇴회원 2
	private String delcont; //탈퇴사유
	private String deldate; //탈퇴날짜
}
