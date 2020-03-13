package cn.kobe.service.impl;

import cn.kobe.bean.Course;
import cn.kobe.beanVo.CourseVo;
import cn.kobe.mapper.CourseMapper;
import cn.kobe.service.CourseService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:03
 * @Describe
 */
@Service("CourseService")
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

    @Override
    public int deleteByPrimaryKey(String courseId) {
        int i = courseMapper.deleteByPrimaryKey(courseId);
        return i;
    }

    @Override
    public int insert(Course record) {
        record.setCourseId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = courseMapper.insert(record);
        return insert;
    }

    @Override
    public Course selectByPrimaryKey(String courseId) {
        Course course = courseMapper.selectByPrimaryKey(courseId);
        return course;
    }

    @Override
    public List<Course> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Course> courses = courseMapper.selectAll(pageNumber, pageSize);
        return courses;
    }

    @Override
    public int updateByPrimaryKey(Course record) {
        int i = courseMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public List<Course> selectByName(String name, Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Course> courses = courseMapper.selectByName(name, pageNumber, pageSize);
        return courses;
    }

    @Override
    public List<Course> selectNewest() {
        List<Course> courses = courseMapper.selectNewest();
        return courses;
    }

    @Override
    public List<Course> searchTop() {
        List<Course> courses = courseMapper.searchTop();
        return courses;
    }

    @Override
    public List<String> searchCate(String title) {
        List<String> strings = courseMapper.searchCate(title);
        return strings;
    }

    @Override
    public Integer getCourseStudent(String courseId) {
        Integer courseStudent = courseMapper.getCourseStudent(courseId);
        return courseStudent;
    }

    @Override
    public List<Course> searchTenCate() {
        List<Course> courses = courseMapper.searchTenCate();
        return courses;
    }

    @Override
    public List<Course> searchByName(String courseName) {
        List<Course> courses = courseMapper.searchByName(courseName);
        return courses;
    }

    @Override
    public List<Course> searchByTeacherId(String id) {
        List<Course> courses = courseMapper.searchByTeacherId(id);
        return courses;
    }

    @Override
    public List<Course> searchStudied(String id) {
        List<Course> courses = courseMapper.searchStudied(id);
        return courses;
    }

    @Override
    public List<Course> searchByCateAndGrade(String cate, String grade, Integer sort) {
        List<Course> courses = courseMapper.searchByCateAndGrade(cate, grade, sort);
        return courses;
    }

    @Override
    public Integer getCounts() {
        Integer counts = courseMapper.getCounts();
        return counts;
    }

    @Override
    public List<Course> getAllCourse() {
        List<Course> allCourse = courseMapper.getAllCourse();
        return allCourse;
    }
}
