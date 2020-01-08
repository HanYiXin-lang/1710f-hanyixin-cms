package com.hanyixin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseDao<T> {

	//按条件查询
	List<T> select(T t);

	//根据ID查询
	T selectById(Integer id);
	//添加
	int insert(T t);
	//修改
	int update(T t);
	//删除
	int delete(@Param("ids") String ids);
}
