package com.example.gulimallmember.dao;

import com.example.gulimallmember.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author xiaoguzai
 * @email xiaoguzai@gmail.com
 * @date 2023-03-10 09:40:51
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
