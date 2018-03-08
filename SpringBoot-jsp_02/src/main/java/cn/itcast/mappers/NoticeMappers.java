package cn.itcast.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.itcast.pojo.Notice;


public interface NoticeMappers {

	
	List<Notice> findAll();
}
