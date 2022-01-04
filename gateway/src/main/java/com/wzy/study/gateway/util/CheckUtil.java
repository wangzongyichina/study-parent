package com.wzy.study.gateway.util;

import com.wzy.study.gateway.exception1.CheckException;

import java.util.stream.Stream;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/5 12:53
 * @Desc:
 */

public class CheckUtil {

    private static String[] INVALID_NAMES = {
        "admin", "administrator", "guanliyuan"
    };

    public static void checkName(String value) {
//        if (Stream.of(INVALID_NAMES).anyMatch(s -> s.equals(value))) {
//            throw new CheckException("name", value);
//        }
        Stream.of(INVALID_NAMES).filter(s -> s.equalsIgnoreCase(value)).findAny().ifPresent(v -> {
            throw new CheckException("name", value);
        });

    }
}
