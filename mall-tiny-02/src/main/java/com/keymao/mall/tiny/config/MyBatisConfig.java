package com.keymao.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by xiaojm on 2020/01/01.
 */
@Configuration
@MapperScan("com.keymao.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
