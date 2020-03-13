package cn.kobe.service;

import cn.kobe.bean.Buy;
import cn.kobe.beanVo.BuyVo;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 18:45
 * @Describe
 */
public interface BuyVoService {
    List<BuyVo> searchSuccessBuy(String studentId);
}
