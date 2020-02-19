package com.Buxton.error;

/**
 * @Author Buxton
 * @Date 2020-02-16 15:37
 * @Description
 */
public interface CommonError {

    public int getErrCode();

    public String getErrMsg();

    public CommonError setErrMsg(String errMsg);
}
