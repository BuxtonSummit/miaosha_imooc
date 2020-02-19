package com.Buxton.error;

/**
 * @Author Buxton
 * @Date 2020-02-16 15:37
 * @Description 返回错误信息接口
 */
public interface CommonError {

    public int getErrCode();

    public String getErrMsg();

    public CommonError setErrMsg(String errMsg);
}
