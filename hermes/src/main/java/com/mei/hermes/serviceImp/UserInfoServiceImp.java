package com.mei.hermes.serviceImp;

import com.google.common.base.Strings;
import com.mei.hermes.dto.UserDTO;
import com.mei.hermes.entity.User;
import com.mei.hermes.entity.UserExample;
import com.mei.hermes.entity.UserInfo;
import com.mei.hermes.entity.UserInfoExample;
import com.mei.hermes.enums.LoginFailCodeEnum;
import com.mei.hermes.mapper.UserInfoMapper;
import com.mei.hermes.mapper.UserMapper;
import com.mei.hermes.service.UserInfoService;
import com.mei.hermes.util.CommonConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserInfoServiceImp implements UserInfoService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    private static int USER_SIZE = 1;
    @Override
    public UserDTO getUserInfoWithCache(String username) {
        if(Strings.isNullOrEmpty(username)){
            log.error("用户名为空");
            return null;
        }
        UserDTO result = new UserDTO();
        //这里本该使用Redis从缓存中取出，若是value无值，再从db中取值
        if(!Strings.isNullOrEmpty(username)){
            UserInfoExample userExample = new UserInfoExample();
            userExample.createCriteria().andUsernameEqualTo(username).andStatusEqualTo(true);
            List<UserInfo> userInfos = userInfoMapper.selectByExample(userExample);
            result.setUsername(userInfos.get(0).getUsername());
        }
        return result;
    }
    private UserDTO builderUserDTO(List<User> users){
        if(CollectionUtils.isEmpty(users)){
            throw new UnknownAccountException(LoginFailCodeEnum.UNKNOW_ACCOUNT.getDesc());
        }
        if(users.size() != USER_SIZE){
            log.error("用户{}存在错误，数据库中存在多条",users.get(0).getUsername());
        }
        UserDTO userDto = UserDTO.builder()
                .encryptPwd(users.get(0).getPassword())
                .userId(users.get(0).getId())
                .username(users.get(0).getUsername())
                .salt(users.get(0).getSalt())
                .needModify(users.get(0).getNeedmodify())
                .isActive(1)
                .build();
        return userDto;

    }
}
