package cn.kobe.service;

import cn.kobe.bean.Course;
import cn.kobe.beanVo.CourseVo;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/21 13:01
 * @Describe
 */
public interface CourseVoService {
    List<CourseVo> searchAllCourse(String courseType);

    List<CourseVo> searchByName(String courseName);
}
