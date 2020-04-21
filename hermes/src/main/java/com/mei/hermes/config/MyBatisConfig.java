package com.mei.hermes.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
@MapperScan("com.mei.hermes.mapper")
@Configuration
public class MyBatisConfig {
}
