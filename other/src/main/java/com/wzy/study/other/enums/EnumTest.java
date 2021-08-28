package com.wzy.study.other.enums;

public class EnumTest {

    public static void main(String[] args) {

        SexEnum byCode = EnumUtil.getByCode(12, SexEnum.class);
        System.out.println("byCode = " + byCode);
        Class<SexEnum> sexEnumClass = SexEnum.class;
        SexEnum[] enumConstants = sexEnumClass.getEnumConstants();
        for (SexEnum sexEnum : enumConstants) {
            System.out.println("sexEnum = " + sexEnum);
        }
    }

}
