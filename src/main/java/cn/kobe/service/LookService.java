package cn.kobe.service;

import cn.kobe.bean.Look;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:38
 * @Describe
 */
public interface LookService {
    int deleteByPrimaryKey(String lookId);

    int insert(Look record);

    Look selectByPrimaryKey(String lookId);

    List<Look> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Look record);

    List<Look> selectByName(String name, Integer pageNumber, Integer pageSize);

    Look selectLook(String lessonId, String studentId);
}
