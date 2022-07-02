package com.wzy.study.design.pattern.proxy.dynamic;

/**
 * @Author: wangzongyi
 * @Data: 2021/12/2 19:50
 * @Desc: 目标对象
 */

public class TeacherDaoImpl implements TeacherDao {
    @Override
    public void teach() {
        System.out.println("TeacherDaoImpl---老师讲课方法");
    }

    @Override
    public String prepareLessons(String subject) {
        String s = "TeacherDaoImpl---老师正在备 " + subject;
        return s;
    }
}
