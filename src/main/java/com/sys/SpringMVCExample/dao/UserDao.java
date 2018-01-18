package com.sys.SpringMVCExample.dao;

import java.util.List;

import com.sys.SpringMVCExample.vo.UserVo;

public interface UserDao {

	List<UserVo> userList() throws Exception;
}
