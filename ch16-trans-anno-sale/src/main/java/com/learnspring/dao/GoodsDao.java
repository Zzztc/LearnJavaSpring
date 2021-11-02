package com.learnspring.dao;

import com.learnspring.entity.Goods;

public interface GoodsDao {
    Goods selectById(Integer id);

    //参数goods 表示是本次购买的商品id和购买数量
    // id 商品id；amount 本次购买的此商品数量
    int updateGoods(Goods goods);
}
