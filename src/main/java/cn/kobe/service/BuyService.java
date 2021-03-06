package cn.kobe.service;

import cn.kobe.bean.Buy;
import cn.kobe.beanVo.BuyVo;

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

    List<Buy> selectByName(String name, Integer pageNumber, Integer pageSize);

}
