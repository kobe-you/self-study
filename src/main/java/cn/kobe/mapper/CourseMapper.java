package cn.kobe.mapper;

import cn.kobe.bean.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {
    int deleteByPrimaryKey(String courseId);

    int insert(Course record);

    Course selectByPrimaryKey(String courseId);

    List<Course> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Course record);
}