package com.sys.SpringMVCExample.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sys.SpringMVCExample.service.ApiService;
import com.sys.SpringMVCExample.vo.UserVo;

@Controller
public class ApiController {

	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

	@Resource
	private ApiService apiService;

	@GetMapping("/user")
	public Object userCheck(@RequestParam Map<String, String> parameters) {
		return apiService.userCheck(parameters);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {

		logger.info("home");

		List<UserVo> userList = apiService.userList();
//		for (int i = 0; i < userList.size(); i++) {
			
//		}
		model.addAttribute("userList", userList);

		return "home";
	}

}
