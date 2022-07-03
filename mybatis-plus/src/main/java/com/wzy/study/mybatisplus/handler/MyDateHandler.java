package com.wzy.study.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/13 0:39
 * @Desc:
 */

//@Log4j2
//@Component
//public class MyDateHandler implements MetaObjectHandler {
//    @Override
//    public void insertFill(MetaObject metaObject) {
//        log.info("开始填充插入的值");
//        log.info("new Date()={}",new Date());
//        this.setFieldValByName("createTime", new Date(), metaObject);
//        this.setFieldValByName("modifyTime", new Date(), metaObject);
//
//    }
//
//    @Override
//    public void updateFill(MetaObject metaObject) {
//        log.info("开始填充更新的值");
//        this.setFieldValByName("modifyTime", new Date(), metaObject);
//    }
//}
