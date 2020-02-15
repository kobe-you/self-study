package cn.kobe.service;

import cn.kobe.bean.Course;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 19:58
 * @Describe
 */
public interface CourseService {
    int deleteByPrimaryKey(String courseId);

    int insert(Course record);

    Course selectByPrimaryKey(String courseId);

    List<Course> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Course record);
}
