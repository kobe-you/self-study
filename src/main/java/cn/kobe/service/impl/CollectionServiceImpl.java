package cn.kobe.service.impl;

import cn.kobe.bean.Collection;
import cn.kobe.mapper.CollectionMapper;
import cn.kobe.service.CollectionService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 19:31
 * @Describe
 */
@Service("collectionService")
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    private CollectionMapper collectionMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

    @Override
    public int deleteByPrimaryKey(String collectionId) {
        int i = collectionMapper.deleteByPrimaryKey(collectionId);
        return i;
    }

    @Override
    public int insert(Collection record) {
        record.setCollectionId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = collectionMapper.insert(record);
        return insert;
    }

    @Override
    public Collection selectByPrimaryKey(String collectionId) {
        Collection collection = collectionMapper.selectByPrimaryKey(collectionId);
        return collection;
    }

    @Override
    public List<Collection> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Collection> collections = collectionMapper.selectAll(pageNumber, pageSize);
        return collections;
    }

    @Override
    public int updateByPrimaryKey(Collection record) {
        int i = collectionMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public List<Collection> selectByName(String name, Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Collection> collections = collectionMapper.selectByName(name, pageNumber, pageSize);
        return collections;
    }
}
