package com.multimodule.business.mapper;

import com.multimodule.business.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodsMapper {
    //get all goods
    List<Goods> selectAllGoods();
}
