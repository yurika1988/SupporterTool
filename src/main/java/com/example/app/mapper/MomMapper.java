package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.Mom;

@Mapper
public interface MomMapper {
	
	List<Mom>selectAll();

}
