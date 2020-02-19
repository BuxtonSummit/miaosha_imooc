package com.Buxton.controller;

import com.Buxton.error.BusinessException;
import com.Buxton.error.EmBusinessError;
import com.Buxton.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Buxton
 * @Date 2020-02-16 16:59
 * @Description WEB层通用类
 */
public class BaseController {

    public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";


    //定义ExceptionHandler解决未被Controller层吸收的Exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception ex) {
        Map<String, Object> responseData = new HashMap<>();
        if (ex instanceof BusinessException) {
            BusinessException businessException = (BusinessException) ex;
            responseData.put("errCode", businessException.getErrCode());
            responseData.put("errMsg", businessException.getErrMsg());
        } else {
            responseData.put("errCode", EmBusinessError.UNKNOWN_ERROR.getErrCode());
            responseData.put("errMsg", EmBusinessError.UNKNOWN_ERROR.getErrMsg());
        }
        return CommonReturnType.create(responseData, "fail");
//        CommonReturnType commonReturnType = new CommonReturnType();
//        commonReturnType.setStatus("fail");
//        Map<String,Object> responseData = new HashMap<>();
//        responseData.put("errCode",businessException.getErrCode());
//        responseData.put("errMsg",businessException.getErrMsg());
//        commonReturnType.setData(responseData);
//        return commonReturnType;
    }
}
