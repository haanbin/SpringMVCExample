package com.sys.SpringMVCExample.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sys.SpringMVCExample.dao.UserDao;
import com.sys.SpringMVCExample.vo.UserVo;

@Repository
public class UserDaoImpl implements UserDao{

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "mappers.memberMapper";

	
	@Override
	public List<UserVo> userList() throws Exception {
		
		return sqlSession.selectList(Namespace+".UserList");
		
	}

	
}
