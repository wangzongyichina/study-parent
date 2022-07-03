package com.wzy.study.user.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Properties;

/**
 * @Author: wangzongyi
 * @Date: 2022/7/3 14:14
 * @Desc:
 */

@Configuration
public class PageHelperConfig {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @PostConstruct
    public void init() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("reasonable", "true");
        properties.setProperty("rowBoundsWithCount", "false");
        pageInterceptor.setProperties(properties);
        sqlSessionFactory.getConfiguration().addInterceptor(pageInterceptor);
    }

}
