package cn.kobe.service;

import cn.kobe.bean.Course;
import cn.kobe.beanVo.CourseVo;

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

    List<Course> selectByName(String name, Integer pageNumber, Integer pageSize);

    List<Course> selectNewest();

    List<Course> searchTop();

    List<String> searchCate(String title);

    Integer getCourseStudent(String courseId);

    List<Course> searchTenCate();

    List<Course> searchByName(String courseName);

    List<Course> searchByTeacherId(String id);

    List<Course> searchStudied(String id);
}
