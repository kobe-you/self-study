package cn.kobe.service.impl;

import cn.kobe.bean.Course;
import cn.kobe.beanVo.CourseVo;
import cn.kobe.mapper.CourseMapper;
import cn.kobe.mapper.CourseVoMapper;
import cn.kobe.service.CourseVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/21 13:02
 * @Describe
 */
@Service("courseVoService")
public class CourseVoServiceImpl implements CourseVoService {
    @Autowired
    private CourseVoMapper courseVoMapper;
    @Override
    public List<CourseVo> searchAllCourse(String courseType) {
        List<CourseVo> courseVos = courseVoMapper.searchAllCourse(courseType);
        return courseVos;
    }

    @Override
    public List<CourseVo> searchByName(String courseName) {
        List<CourseVo> courses = courseVoMapper.searchByName(courseName);
        return courses;
    }
}
