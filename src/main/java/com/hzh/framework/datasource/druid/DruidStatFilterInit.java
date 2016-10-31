package com.hzh.framework.datasource.druid;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.util.EnumSet;

/**
 * Druid web 监控注册
 * Created by Zhanhao Wong on 2016/10/31.
 */
@Component
public class DruidStatFilterInit implements org.springframework.boot.web.servlet.ServletContextInitializer {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        logger.info("注册 druid 监控 filter 和 servlet");

        // 注册监控 filter
        FilterRegistration druidWebStatFilter = servletContext.addFilter("druidWebStatFilter", WebStatFilter.class);
        druidWebStatFilter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
        druidWebStatFilter.setInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");

        // 注册查看监控页面
        ServletRegistration druidStatView = servletContext.addServlet("druidStatView", StatViewServlet.class);
        druidStatView.addMapping("/druid/*");
    }
}
