package com.cicdproject.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cicdproject.dto.CouponDto;
import com.cicdproject.service.CouponServiceImpl;

@RestController
public class CouponController {
	@Autowired
	CouponServiceImpl couponServiceImpl;
	
	@RequestMapping("/getCouponCnt")
	public int getCouponCnt() {
		return couponServiceImpl.getCouponCnt();
	}
	
	@RequestMapping("/selectCouponList")
	public List<CouponDto> selectCouponList(){
		return couponServiceImpl.selectCouponList(0,0);
	}
	
	@RequestMapping("/insertCoupon")
	public void insertCoupon(CouponDto couponDto) {
		couponDto.setCouponNo("1234");
		couponDto.setEmailAddr("hsw190701@lgupluspartners.co.kr");
		couponDto.setRegDate(new Date());
		couponServiceImpl.insertCoupon(couponDto);
	}
}
