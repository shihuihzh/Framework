package com.hzh.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * APP 启动结束后执行
 * Created by Zhanhao Wong on 2016/10/30.
 */
@Component
public class ExamplePostApp implements CommandLineRunner, ApplicationRunner {        // 实现任何一个类即可

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * APP 启动前执行方法
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        // 获得参数
        logger.info("启动参数" + Arrays.asList(args));


        // Do something...

    }

    /**
     * APP 启动前执行方法，等效封装上面的方法
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 获得参数
        logger.info("启动参数2" + Arrays.asList(args.getSourceArgs()));

        // Do something...

    }
}
