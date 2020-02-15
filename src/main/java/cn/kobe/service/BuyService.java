package cn.kobe.service;

import cn.kobe.bean.Buy;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 18:45
 * @Describe
 */
public interface BuyService {
    int deleteByPrimaryKey(String buyId);

    int insert(Buy record);

    Buy selectByPrimaryKey(String buyId);

    List<Buy> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Buy record);
}
