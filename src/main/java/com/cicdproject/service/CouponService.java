package com.cicdproject.service;

import java.util.List;

import com.cicdproject.dto.CouponDto;

public interface CouponService {
	public int getCouponCnt();
	public List<CouponDto> selectCouponList(int pageNo, int pageSize);
	public void insertCoupon(CouponDto couponDto);
	
}
