package com.example.demo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationVO {

	private String resid;
	private String resDay;
	private String startDay;
	private String endDay;
	private int price;
	private String sitenum;
	private int siteStatus;
	private String userid;
	private String resname;
	private String phone;
	private String carnum;
	private String carkinds;
	private int paymethod;
	private int paystatus;
	
	//페이징 쪽나누기 관련변수
    private int startrow;//시작행 번호
    private int endrow;//끝행 번호
    
    //검색기능
    private String find_name;//검색어
    private String find_field;//검색필드
}
