package com.pp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.dao.TestObjDao;
import com.pp.po.TestObj;

@Service
public class TestObjService {
	@Autowired
	private TestObjDao testObjDao;
	
	public TestObj getTestObjById(int id) {
		TestObj obj = testObjDao.getTestObjById(id);
		
		return obj;
	}
}
