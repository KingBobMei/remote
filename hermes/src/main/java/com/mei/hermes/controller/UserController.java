package com.mei.hermes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mei.hermes.dto.UserDTO;
import com.mei.hermes.entity.UserInfo;
import com.mei.hermes.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mei.hermes.entity.User;
import com.mei.hermes.message.Response;
import com.mei.hermes.service.UserService;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserInfoService userInfoService;

	@PostMapping("/login")
	@ApiOperation("login for user")
	public Response<User> login(@RequestBody String username, String password, HttpServletRequest request, HttpServletResponse response){
		log.info("start to login for user {}",username);
		try{
			System.out.println("进入后台");
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			subject.login(token);
			UserDTO userDTO = userInfoService.getUserInfoWithCache(username);
			User user = new User();
			BeanUtils.copyProperties(userDTO,user);
			return Response.success(user);
		}catch(UnknownAccountException e){
			log.error("this user {} not exist",username);
			Response.error("not exist user");
		}catch(IncorrectCredentialsException e){
			log.error("user {} password {} is not true",username,password);
			Response.error("false password");
		}
		return Response.success(new User());
	}

	@PostMapping("getInfo")
	@ApiOperation("get user base info")
	public Response<UserInfo> getInfo(){
		return null;
	}
	@PostMapping("logout")
	@ApiOperation("user exist")
	public Response logout(){
		return null;
	}
}
