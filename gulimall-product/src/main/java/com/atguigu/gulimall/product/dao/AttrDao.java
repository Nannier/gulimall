package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author meiguosheng
 * @email meiguosheng@gmail.com
 * @date 2022-01-06 23:05:38
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
