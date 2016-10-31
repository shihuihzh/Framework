package com.hzh.framework.datasource.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.logging.Log;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.sql.DataSource;

/**
 * druid 数据源配置
 * Created by Zhanhao Wong on 2016/10/31.
 */
@Configuration
@ConditionalOnClass(DruidDataSource.class)
public class DruidConfiguration  {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource dataSource(DataSourceProperties properties) {
        DruidDataSource dataSource =  new DruidDataSource();
        dataSource.setUsername(properties.getUsername());
        dataSource.setPassword(properties.getPassword());
        dataSource.setUrl(properties.getUrl());
        return dataSource;
    }

}
