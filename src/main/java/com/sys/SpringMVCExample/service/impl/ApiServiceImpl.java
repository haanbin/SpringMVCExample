package com.sys.SpringMVCExample.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sys.SpringMVCExample.dao.UserDao;
import com.sys.SpringMVCExample.service.ApiService;
import com.sys.SpringMVCExample.vo.UserVo;

@Service("apiService")
public class ApiServiceImpl implements ApiService{
	
	@Inject
	private UserDao dao;
	
	@Override
	public Map<String, Object> userCheck(Map<String, String> userInfoMap) {
		Map<String, Object> responseData = new HashMap<String, Object>();
		responseData.put("name", userInfoMap.get("name"));
		responseData.put("password", userInfoMap.get("password"));
		return responseData;
	}

	@Override
	public List<UserVo> userList() throws Exception {
//		List<UserVo> userVos = new ArrayList<>();
//		userVos = dao.userList();
		return dao.userList();
	}
	
	
}
