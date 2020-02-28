package cn.kobe.service;

import cn.kobe.bean.Pay;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:51
 * @Describe
 */
public interface PayService {
    int deleteByPrimaryKey(String payId);

    int insert(Pay record);

    Pay selectByPrimaryKey(String payId);

    List<Pay> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Pay record);

    List<Pay> selectByName(String name, Integer pageNumber, Integer pageSize);
}
