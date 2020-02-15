package cn.kobe.service.impl;

import cn.kobe.bean.Pay;
import cn.kobe.mapper.PayMapper;
import cn.kobe.service.PayService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:51
 * @Describe
 */
@Service("payService")
public class PayServiceImpl implements PayService {
    @Autowired
    private PayMapper payMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

    @Override
    public int deleteByPrimaryKey(String payId) {
        int i = payMapper.deleteByPrimaryKey(payId);
        return i;
    }

    @Override
    public int insert(Pay record) {
        record.setPayId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = payMapper.insert(record);
        return insert;
    }

    @Override
    public Pay selectByPrimaryKey(String payId) {
        Pay pay = payMapper.selectByPrimaryKey(payId);
        return pay;
    }

    @Override
    public List<Pay> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Pay> pays = payMapper.selectAll(pageNumber, pageSize);
        return pays;
    }

    @Override
    public int updateByPrimaryKey(Pay record) {
        int i = payMapper.updateByPrimaryKey(record);
        return i;
    }
}
