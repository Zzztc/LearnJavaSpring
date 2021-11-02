package com.learnspring.service;

public interface BuyGoodsService {
    /*
        goodsId:购买的商品id
        num:购买的商品数量
     */
    void buy(Integer goodsId,Integer num);

}
