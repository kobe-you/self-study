package cn.kobe.service;

import cn.kobe.bean.Collection;
import cn.kobe.bean.Course;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 19:30
 * @Describe
 */
public interface CollectionService {
    int deleteByPrimaryKey(String collectionId);

    int insert(Collection record);

    Collection selectByPrimaryKey(String collectionId);

    List<Collection> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Collection record);

    List<Collection> selectByName(String name, Integer pageNumber, Integer pageSize);

    Integer startCollection(String s);

    Integer banCollection(String s);

    List<Collection> isCollected(String studentId, String courseId);

}
