package com.sys.SpringMVCExample.service;

import java.util.Map;


public interface ApiService {

	Map<String, Object> userCheck(Map<String, String> userInfoMap);
	
}
