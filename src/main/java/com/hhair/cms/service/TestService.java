package com.hhair.cms.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.hhair.cms.entity.*;
import com.hhair.cms.mapper.*;

@Service
public class TestService {
	
	@Autowired private TestTableMapper mapper;
	
	public void testMethod() {
		List<TestTable> testTableList = mapper.testTable();
		
		for(TestTable table : testTableList) {
			System.out.println(table.toString());
		}
	}
}
