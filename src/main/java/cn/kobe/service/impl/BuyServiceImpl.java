package cn.kobe.service.impl;

import cn.kobe.bean.Buy;
import cn.kobe.mapper.BuyMapper;
import cn.kobe.service.BuyService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 18:46
 * @Describe
 */
@Service("buyService")
public class BuyServiceImpl implements BuyService {
    @Autowired
    private BuyMapper buyMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

    @Override
    public int deleteByPrimaryKey(String buyId) {
        int i = buyMapper.deleteByPrimaryKey(buyId);
        return i;
    }

    @Override
    public int insert(Buy record) {
        record.setBuyId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = buyMapper.insert(record);
        return insert;
    }

    @Override
    public Buy selectByPrimaryKey(String buyId) {
        Buy buy = buyMapper.selectByPrimaryKey(buyId);
        return buy;
    }

    @Override
    public List<Buy> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Buy> buys = buyMapper.selectAll(pageNumber, pageSize);
        return buys;
    }

    @Override
    public int updateByPrimaryKey(Buy record) {
        int i = buyMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public List<Buy> selectByName(String name, Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Buy> buys = buyMapper.selectByName(name, pageNumber, pageSize);
        return buys;
    }
}
