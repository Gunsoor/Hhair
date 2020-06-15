package com.hhair.cms.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.hhair.cms.entity.*;


@Mapper
public interface TestTableMapper {
	List<TestTable> testTable();
}
