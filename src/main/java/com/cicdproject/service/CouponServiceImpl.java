package com.cicdproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicdproject.dto.CouponDto;
import com.cicdproject.mapper.CouponMapper;

@Service
public class CouponServiceImpl implements CouponService{

	@Autowired
	CouponMapper couponMapper;
	
	@Override
	public int getCouponCnt() {
		// TODO Auto-generated method stub
		return couponMapper.getCouponCnt();
	}

	@Override
	public List<CouponDto> selectCouponList(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return couponMapper.selectCouponList(pageNo, pageSize);
	}

	@Override
	public void insertCoupon(CouponDto couponDto) {
		// TODO Auto-generated method stub
		couponMapper.insertCoupon(couponDto);
	}

}
