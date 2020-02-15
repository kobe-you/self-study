package cn.kobe.service.impl;

import cn.kobe.bean.Course;
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
}
