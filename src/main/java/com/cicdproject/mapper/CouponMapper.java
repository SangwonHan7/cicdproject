package com.cicdproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cicdproject.dto.CouponDto;

@Mapper
public interface CouponMapper {
	public int getCouponCnt();
	public List<CouponDto> selectCouponList(int pageNo, int pageSize);
	public void insertCoupon(CouponDto couponDto);
}
