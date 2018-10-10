package com.pp.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.pp.po.TestObj;
import com.pp.utils.MybatisUtils;
@Repository(value="TestObjDao")
public class TestObjDao {
	public TestObj getTestObjById(int id) {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		TestObj obj = sqlSession.selectOne("com.pp.mapper.TestObjMapper.getTestObj", id);
		
		return obj;
	}
}
