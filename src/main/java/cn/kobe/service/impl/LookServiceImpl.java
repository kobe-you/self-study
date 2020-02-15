package cn.kobe.service.impl;

import cn.kobe.bean.Look;
import cn.kobe.mapper.LookMapper;
import cn.kobe.service.LookService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:39
 * @Describe
 */
@Service("lookService")
public class LookServiceImpl implements LookService {
    @Autowired
    private LookMapper lookMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

    @Override
    public int deleteByPrimaryKey(String lookId) {
        int i = lookMapper.deleteByPrimaryKey(lookId);
        return i;
    }

    @Override
    public int insert(Look record) {
        record.setLookId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = lookMapper.insert(record);
        return insert;
    }

    @Override
    public Look selectByPrimaryKey(String lookId) {
        Look look = lookMapper.selectByPrimaryKey(lookId);
        return look;
    }

    @Override
    public List<Look> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Look> looks = lookMapper.selectAll(pageNumber, pageSize);
        return looks;
    }

    @Override
    public int updateByPrimaryKey(Look record) {
        int i = lookMapper.updateByPrimaryKey(record);
        return i;
    }
}
