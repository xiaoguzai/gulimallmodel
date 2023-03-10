package com.example.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimallcoupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author xiaoguzai
 * @email xiaoguzai@gmail.com
 * @date 2023-03-09 13:49:24
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

