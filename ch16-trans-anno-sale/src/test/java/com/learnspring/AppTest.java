package com.learnspring;

import static org.junit.Assert.assertTrue;

import com.learnspring.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx= new ClassPathXmlApplicationContext(config);
        BuyGoodsService buyGoodsService = (BuyGoodsService) ctx.getBean("buyGoodsService");
        buyGoodsService.buy(1001,1);

    }
}
