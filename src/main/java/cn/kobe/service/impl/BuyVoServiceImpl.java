package cn.kobe.service.impl;

import cn.kobe.beanVo.BuyVo;
import cn.kobe.mapper.BuyMapper;
import cn.kobe.mapper.BuyVoMapper;
import cn.kobe.service.BuyVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/28 21:02
 * @Describe
 */
@Service("buyVoService")
public class BuyVoServiceImpl implements BuyVoService {
    @Autowired
    private BuyVoMapper buyVoMapper;
    @Override
    public List<BuyVo> searchSuccessBuy(String studentId) {
        List<BuyVo> buyVos = buyVoMapper.searchSuccessBuy(studentId);
        return buyVos;
    }
}
