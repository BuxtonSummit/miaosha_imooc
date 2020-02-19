package com.Buxton.service;

import com.Buxton.service.model.PromoModel;

/**
 * @Author Buxton
 * @Date 2020-02-19 11:15
 * @Description
 */
public interface PromoService {
    //根据ItemId获取即将进行的或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
