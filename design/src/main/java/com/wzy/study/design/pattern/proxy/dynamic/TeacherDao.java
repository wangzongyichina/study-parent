package com.wzy.study.design.pattern.proxy.dynamic;

/**
 * @Author: wangzongyi
 * @Data: 2021/12/2 19:49
 * @Desc:
 */

public interface TeacherDao {

    void teach();

    String prepareLessons(String subject);
}
