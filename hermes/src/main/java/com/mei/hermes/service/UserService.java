package com.mei.hermes.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public boolean login(String username,String password);
}
