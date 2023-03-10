package com.example.gulimallcoupon.dao;

import com.example.gulimallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiaoguzai
 * @email xiaoguzai@gmail.com
 * @date 2023-03-09 13:49:24
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
