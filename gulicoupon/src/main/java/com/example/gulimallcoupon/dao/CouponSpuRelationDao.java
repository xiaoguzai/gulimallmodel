package com.example.gulimallcoupon.dao;

import com.example.gulimallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author xiaoguzai
 * @email xiaoguzai@gmail.com
 * @date 2023-03-09 13:49:24
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
