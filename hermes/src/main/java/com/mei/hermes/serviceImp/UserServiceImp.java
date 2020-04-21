package com.mei.hermes.serviceImp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import com.mei.hermes.mapper.UserMapper;
import com.mei.hermes.service.UserService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImp implements UserService{


	private 	UserMapper userMapper;
	

	@Override
	public boolean login(String username, String password) {

		return false;
	}
	
}
