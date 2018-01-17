package com.sys.SpringMVCExample.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


import com.sys.SpringMVCExample.service.ApiService;

@Service("apiService")
public class ApiServiceImpl implements ApiService{
	
	
	@Override
	public Map<String, Object> userCheck(Map<String, String> userInfoMap) {
		Map<String, Object> responseData = new HashMap<String, Object>();
		responseData.put("name", userInfoMap.get("name"));
		responseData.put("password", userInfoMap.get("password"));
		return responseData;
	}
}
