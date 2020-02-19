package com.Buxton.service.impl;

import com.Buxton.dao.PromoMapper;
import com.Buxton.domain.Promo;
import com.Buxton.service.PromoService;
import com.Buxton.service.model.PromoModel;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Buxton
 * @Date 2020-02-19 11:16
 * @Description
 */
@Service
public class PromoServiceImpl implements PromoService {

    @Autowired
    private PromoMapper promoMapper;

    @Override
    public PromoModel getPromoByItemId(Integer itemId) {
        //获取对应商品的对应秒杀活动信息
        Promo promo = promoMapper.selectByItemId(itemId);

        //DataObject->Model
        PromoModel promoModel = convertFromDataObject(promo);
        if (promoModel == null) {
            return null;
        }

        //判断当前时间是否秒杀活动即将开始或者正在进行
        if (promoModel.getStartDate().isAfterNow()) {
            promoModel.setStatus(1);
        } else if (promoModel.getEndDate().isBeforeNow()) {
            promoModel.setStatus(3);
        } else {
            promoModel.setStatus(2);
        }
        return promoModel;
    }

    //Promo数据传入到PromoModel中
    private PromoModel convertFromDataObject(Promo promo) {
        if (promo == null) {
            return null;
        }
        PromoModel promoModel = new PromoModel();
        BeanUtils.copyProperties(promo, promoModel);
        promoModel.setStartDate(new DateTime(promo.getStartDate()));
        promoModel.setEndDate(new DateTime(promo.getEndDate()));
        return promoModel;
    }
}
