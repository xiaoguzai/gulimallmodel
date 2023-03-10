package com.example.gulimallorder.dao;

import com.example.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaoguzai
 * @email xiaoguzai@gmail.com
 * @date 2023-03-10 10:15:08
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
