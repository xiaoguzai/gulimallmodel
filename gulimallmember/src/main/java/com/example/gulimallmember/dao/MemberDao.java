package com.example.gulimallmember.dao;

import com.example.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaoguzai
 * @email xiaoguzai@gmail.com
 * @date 2023-03-10 09:40:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
