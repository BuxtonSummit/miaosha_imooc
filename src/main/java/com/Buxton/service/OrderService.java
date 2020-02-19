package com.Buxton.service;

import com.Buxton.error.BusinessException;
import com.Buxton.service.model.OrderModel;

/**
 * @Author Buxton
 * @Date 2020-02-18 10:37
 * @Description
 */
public interface OrderService {
    //推荐使用：通过前端url上传过来秒杀活动id 然后下单接口校验对应id是否属于应对商品且活动已开始
    //直接在下单接口内判断对应的商品是否存在秒杀活动 若存在进行中的则以秒杀价格下单
    OrderModel createOrder(Integer userId, Integer itemId, Integer amount, Integer promoId) throws BusinessException;
}
