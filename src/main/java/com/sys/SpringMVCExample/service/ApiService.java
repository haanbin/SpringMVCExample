package com.sys.SpringMVCExample.service;

import java.util.List;
import java.util.Map;

import com.sys.SpringMVCExample.vo.UserVo;


public interface ApiService {

	Map<String, Object> userCheck(Map<String, String> userInfoMap);
	
	List<UserVo> userList() throws Exception;
}
