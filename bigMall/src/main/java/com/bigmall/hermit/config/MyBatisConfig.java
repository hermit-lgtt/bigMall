package com.bigmall.hermit.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description MyBatis配置类
 *
 * @MapperScan 扫描加载
 */
@Configuration
@MapperScan("com.bigmall.hermit.mmg.mapper")
public class MyBatisConfig {
}
