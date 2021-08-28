package com.wzy.study.other.enums;

public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        System.out.println(enumClass);
        System.out.println("enumClass.getName() = " + enumClass.getName());
        //通过反射取出Enum所有常量的属性值
        for (T each : enumClass.getEnumConstants()) {
            //利用code进行循环比较，获取对应的枚举
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        throw new RuntimeException(String.format("not find Enum,code=%s,eClass=%s", code, enumClass.getName()));
    }
}
