package com.hzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 启动 APP
 * 默认情况下，需要的类这个包以下开始扫描
 * Created by Zhanhao Wong on 2016/10/30.
 */
@Configuration
@ComponentScan
@ServletComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties
public class StartApp {


    /**
     * serlvet 容器全局配置
     * @return
     */
    @Bean
    public EmbeddedServletContainerCustomizer servletContainerCustomizer() {
        return new EmbeddedServletContainerCustomizer() {

            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                //container.setPort(8088);
            }
        };
    }

    /**
     * 初始化方法
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}
