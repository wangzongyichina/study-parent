package com.wzy.study.system.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author: wangzongyi
 * @Data: 2021/4/16 23:00
 * @Desc:
 */
@ApiModel("接口返回对象")
public class ResultVO<T> implements Serializable {
    @ApiModelProperty("响应编码")
    private String resultCode;
    @ApiModelProperty("响应消息")
    private String resultMsg;
    @ApiModelProperty("异常类型，默认为正常提示 \n 不提示异常：0\n 正常提示异常：1\n 如果后续还需要加提示方式继续扩张字典值")
    private String errorType = "1";
    @ApiModelProperty("响应结果")
    private T resultData;

    public ResultVO() {
    }

    private ResultVO(String resultCode) {
        this.resultCode = resultCode;
    }

    private ResultVO(String resultCode, T resultData) {
        this.resultCode = resultCode;
        this.resultData = resultData;
    }

    private ResultVO(String resultCode, String resultMsg, T resultData) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.resultData = resultData;
    }

    private ResultVO(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    private ResultVO(String resultCode, String resultMsg, String errorType) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.errorType = errorType;
    }

    public static <T> ResultVO<T> success() {
        return new ResultVO(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getDesc());
    }

    public static <T> ResultVO<T> successMessage(String msg) {
        return new ResultVO(ResultCodeEnum.SUCCESS.getCode(), msg);
    }

    public static <T> ResultVO<T> success(T data) {
        return new ResultVO(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getDesc(), data);
    }

    public static <T> ResultVO<T> success(String msg, T data) {
        return new ResultVO(ResultCodeEnum.SUCCESS.getCode(), msg, data);
    }

    public static <T> ResultVO<T> error() {
        return new ResultVO(ResultCodeEnum.ERROR.getCode(), ResultCodeEnum.ERROR.getDesc());
    }

    public static <T> ResultVO<T> error(String errorMessage) {
        return new ResultVO(ResultCodeEnum.ERROR.getCode(), errorMessage);
    }

    public static <T> ResultVO<T> error(String errorMessage, Object... args) {
        return new ResultVO(ResultCodeEnum.ERROR.getCode(), String.format(errorMessage, args));
    }

    public static <T> ResultVO<T> errorEnum(ResultCode resultCode) {
        return new ResultVO(resultCode.getCode(), resultCode.getDesc(), resultCode.getErrorType());
    }

    public static <T> ResultVO<T> error(String errorCode, String errorMessage, String errorType) {
        return new ResultVO(errorCode, errorMessage, errorType);
    }

    public static <T> ResultVO<T> error(String errorCode, String errorMessage) {
        return new ResultVO(errorCode, errorMessage);
    }

    public static <T> ResultVO<T> error(ResultCode resultCode) {
        return new ResultVO(resultCode.getCode(), resultCode.getDesc(), resultCode.getErrorType());
    }

    public static <T> ResultVO<T> error(ResultCode resultCode, Object... args) {
        return new ResultVO(resultCode.getCode(), String.format(resultCode.getDesc(), args));
    }

    public static void main(String[] args) {
        ResultCode resultCode = new ResultCode() {
            public String getCode() {
                return "ERROR";
            }

            public String getDesc() {
                return "这是一个包含两个占位符的提示%s-%s";
            }

            public String getErrorType() {
                return "1";
            }
        };
        System.out.println(error(resultCode).getResultMsg());
        System.out.println(error(resultCode, "张珊", "你好").getResultMsg());
    }

    @JsonIgnore
    public boolean isSuccess() {
        return ResultCodeEnum.SUCCESS.getCode().equals(this.resultCode);
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public String getErrorType() {
        return this.errorType;
    }

    public T getResultData() {
        return this.resultData;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public void setResultData(T resultData) {
        this.resultData = resultData;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResultVO)) {
            return false;
        } else {
            ResultVO<?> other = (ResultVO) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59:
                {
                    Object this$resultCode = this.getResultCode();
                    Object other$resultCode = other.getResultCode();
                    if (this$resultCode == null) {
                        if (other$resultCode == null) {
                            break label59;
                        }
                    } else if (this$resultCode.equals(other$resultCode)) {
                        break label59;
                    }

                    return false;
                }

                Object this$resultMsg = this.getResultMsg();
                Object other$resultMsg = other.getResultMsg();
                if (this$resultMsg == null) {
                    if (other$resultMsg != null) {
                        return false;
                    }
                } else if (!this$resultMsg.equals(other$resultMsg)) {
                    return false;
                }

                Object this$errorType = this.getErrorType();
                Object other$errorType = other.getErrorType();
                if (this$errorType == null) {
                    if (other$errorType != null) {
                        return false;
                    }
                } else if (!this$errorType.equals(other$errorType)) {
                    return false;
                }

                Object this$resultData = this.getResultData();
                Object other$resultData = other.getResultData();
                if (this$resultData == null) {
                    if (other$resultData != null) {
                        return false;
                    }
                } else if (!this$resultData.equals(other$resultData)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ResultVO;
    }

    public int hashCode() {
        int PRIME = 1;
        int result = 1;
        Object $resultCode = this.getResultCode();
        result = result * 59 + ($resultCode == null ? 43 : $resultCode.hashCode());
        Object $resultMsg = this.getResultMsg();
        result = result * 59 + ($resultMsg == null ? 43 : $resultMsg.hashCode());
        Object $errorType = this.getErrorType();
        result = result * 59 + ($errorType == null ? 43 : $errorType.hashCode());
        Object $resultData = this.getResultData();
        result = result * 59 + ($resultData == null ? 43 : $resultData.hashCode());
        return result;
    }

    public String toString() {
        return "ResultVO(resultCode=" + this.getResultCode() + ", resultMsg=" + this.getResultMsg() + ", errorType=" + this.getErrorType() + ", resultData=" + this.getResultData() + ")";
    }
}
