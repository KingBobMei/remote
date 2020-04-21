package com.mei.hermes.service;

import com.mei.hermes.dto.UserDTO;

public interface UserInfoService {

    public UserDTO getUserInfoWithCache(String username);
}
