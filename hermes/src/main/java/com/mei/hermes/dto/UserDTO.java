package com.mei.hermes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO implements Serializable {
    private String username;
    private String password;
    private String encryptPwd;
    private Integer userId;
    private String salt;
    private Integer isActive;
    private boolean needModify;
    private List<String> roles;
    private List<String> permissions;
}
