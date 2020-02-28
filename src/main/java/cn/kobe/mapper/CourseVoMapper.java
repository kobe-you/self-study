package cn.kobe.mapper;

import cn.kobe.bean.Course;
import cn.kobe.beanVo.CourseVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/21 13:00
 * @Describe
 */
@Repository
public interface CourseVoMapper {
    List<CourseVo> searchAllCourse(String courseType);

    List<CourseVo> searchByName(String courseName);
}
