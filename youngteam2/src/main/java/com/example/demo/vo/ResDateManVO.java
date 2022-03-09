package com.example.demo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResDateManVO {
	private String resDateManId;
	private String resDate;
	private String sitenum;
	private String userid;
	private String resid;
	private int rescount;
	private int resManList;
	
	//페이징 쪽나누기 관련변수
    private int startrow;//시작행 번호
    private int endrow;//끝행 번호
    
    //검색기능
    private String find_name;//검색어
    private String find_field;//검색필드
	
}
