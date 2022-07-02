package com.wzy.study.design.pattern.proxy.cjlb;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/2 19:49
 * @Desc:
 */

public class CglibTeacherDao {

    public void teach() {
        System.out.println("CglibTeacherDao---老师讲课方法");
    }

    public String prepareLessons(String subject) {
        String s = "CglibTeacherDao---老师正在备 " + subject;
        System.out.println(s);
        return s;
    }

}
