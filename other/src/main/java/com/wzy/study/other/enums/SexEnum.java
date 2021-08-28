package com.wzy.study.other.enums;

public enum SexEnum implements CodeEnum {
    WoMan(0,"女人"),
    Man(1,"男人"),
    Other(3,"其他")
    ;

    private Integer code ;
    private String description ;

    SexEnum(Integer code,String description){
        this.code=code;
        this.description=description;
    }


    @Override
    public Integer getCode() {
        return this.code;
    }
}
