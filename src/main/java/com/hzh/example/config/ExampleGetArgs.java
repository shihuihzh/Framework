package com.hzh.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 获得系统启动参数
 * Created by Zhanhao Wong on 2016/10/30.
 */
@Component
public class ExampleGetArgs {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * 自动注入参数对象
     * @param args
     */
    @Autowired
    public void myArgs(ApplicationArguments args) {
        logger.info("启动参数getNonOptionArgs:" + args.getNonOptionArgs());
        logger.info("启动参数getSourceArgs:" + Arrays.asList(args.getSourceArgs()));

        try {
            logger.info("启动参数getOptionNames:" + args.getOptionNames());
            if(!args.getOptionNames().isEmpty()) {
                logger.info("启动参数getOptionValues:" + args.getOptionValues(args.getOptionNames().iterator().next()));
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }

        // Do something...

    }



}
