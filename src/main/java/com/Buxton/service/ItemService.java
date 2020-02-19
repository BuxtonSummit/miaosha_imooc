package com.Buxton.service;

import com.Buxton.error.BusinessException;
import com.Buxton.service.model.ItemModel;

import java.util.List;

/**
 * @Author Buxton
 * @Date 2020-02-17 14:46
 * @Description
 */
public interface ItemService {

    //创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    //商品列表浏览
    List<ItemModel> listItem();

    //商品详情浏览
    ItemModel getItemById(Integer id);

    //库存扣减
    boolean decreaseStock(Integer itemId, Integer amount);

    //商品销量增加
    void increaseSales(Integer itemId, Integer amount);
}
