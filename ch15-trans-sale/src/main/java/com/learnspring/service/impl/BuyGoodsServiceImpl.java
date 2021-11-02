package com.learnspring.service.impl;

import com.learnspring.dao.GoodsDao;
import com.learnspring.dao.SaleDao;
import com.learnspring.entity.Goods;
import com.learnspring.entity.Sale;
import com.learnspring.exception.NotEnoughException;
import com.learnspring.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {

    private SaleDao saleDao;
    private GoodsDao goodsDao;

    public SaleDao getSaleDao() {
        return saleDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public void buy(Integer goodsId, Integer num) {
        System.out.println("buy方法的开始");

        //生成销售记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNum(num);
        saleDao.insertSale(sale);
        //查询商品
        Goods goods=goodsDao.selectById(goodsId);
        if(goods==null){
            throw new NullPointerException(goodsId+"商品不存在");
        }else if(goods.getAmount()<num){
            throw new NotEnoughException(goodsId+"库存不足");
        }
        //更新库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(num);
        goodsDao.updateGoods(buyGoods);

        System.out.println("buy方法的完成");
    }
}
