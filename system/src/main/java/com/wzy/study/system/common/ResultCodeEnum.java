package com.wzy.study.system.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * @Author: wangzongyi
 * @Data: 2021/4/16 22:59
 * @Desc:
 */
public enum ResultCodeEnum implements ResultCode {

    SUCCESS("0", "SUCCESS"),
    ERROR("-1", "ERROR"),
    ROP_INVOKE_EXCEPTION("-2", "ROP INVOKE EXCEPTION"),
    LACK_OF_PARAM("-3", "LACK_OF_PARAM"),
    SPEC_VALUES_CAN_NOT_BE_NULL("-7", "规格值不能为空"),
    FORBID_CONSUMER("-8", "缺少服务提供"),
    FILE_UPLOAD_ERROR("-9", "附件上传失败"),
    FORBID_UPLOAD_ERROR("-10", "非法的附件类型"),
    NOT_LOGIN("100", "用户未登录"),
    INVALID_TOKEN("101", "TOKEN无效"),
    LOST_TOKEN("102", "TOKEN缺失"),
    NOT_BINDING_WX("103", "用户未绑定"),
    SYSTEM_ERROR("500", "服务器内部错误"),
    PAGE_NOT_FOUND("404", "页面找不到"),
    PARAMTER_ERROR("400", "请求参数异常"),
    INSERT_DB_EXCEPTION("common_0000001", "INSERT_DB_EXCEPTION"),
    DELETE_DB_EXCEPTION("common_0000002", "DELETE_DB_EXCEPTION"),
    UPDATE_DB_EXCEPTION("common_0000003", "UPDATE_DB_EXCEPTION"),
    QUERY_DB_EXCEPTION("common_0000004", "QUERY_DB_EXCEPTION");

    private final String code;
    private final String desc;
    private final String errorType;

    private ResultCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
        this.errorType = "1";
    }

    private ResultCodeEnum(String code, String desc, String errorType) {
        this.code = code;
        this.desc = desc;
        this.errorType = errorType;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getErrorType() {
        return this.errorType;
    }

}
