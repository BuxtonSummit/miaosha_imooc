package com.Buxton.service;

import com.Buxton.error.BusinessException;
import com.Buxton.service.model.UserModel;

/**
 * @Author Buxton
 * @Date 2020-02-16 13:34
 * @Description
 */
public interface UserService {
    //通过ID获取用户对象
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /**
     * @param telphone       用户注册手机号
     * @param encrptPassword 用户加密后的密码
     * @throws BusinessException
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
