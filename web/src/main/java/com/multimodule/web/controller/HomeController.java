package com.multimodule.web.controller;

import com.multimodule.business.mapper.GoodsMapper;
import com.multimodule.business.pojo.Goods;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Resource
    private GoodsMapper goodsMapper;

    // list all goods
    @GetMapping("/home")
    public String all() {
        List<Goods> goodsList = goodsMapper.selectAllGoods();
        String retStr = "";
        for (Goods goodsOne : goodsList) {
            String oneStr = goodsOne.toString()+"<br/>";
            //i++;
            retStr += oneStr;
        }
        return retStr;
    }
}
