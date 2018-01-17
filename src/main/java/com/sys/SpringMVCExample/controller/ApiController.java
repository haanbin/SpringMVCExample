package com.sys.SpringMVCExample.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sys.SpringMVCExample.service.ApiService;

@RestController
public class ApiController {
	@Resource
	private ApiService apiService;
	
	@GetMapping("/user")
	public Object userCheck(@RequestParam Map<String, String> parameters ){
		return apiService.userCheck(parameters);
	}
}
