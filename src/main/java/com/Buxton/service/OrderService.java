package com.Buxton.service;

import com.Buxton.error.BusinessException;
import com.Buxton.service.model.OrderModel;

/**
 * @Author Buxton
 * @Date 2020-02-18 10:37
 * @Description
 */
public interface OrderService {
    OrderModel createOrder(Integer userId, Integer itemId, Integer amount) throws BusinessException;
}
