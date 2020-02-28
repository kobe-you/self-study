package cn.kobe.mapper;

import cn.kobe.bean.Course;
import cn.kobe.beanVo.CourseVo;
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

    List<Course> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    List<Course> selectNewest();

    List<Course> searchTop();

    List<String> searchCate(String title);

    Integer getCourseStudent(String courseId);

    List<Course> searchByTeacherId(String id);

    List<Course> searchTenCate();

    List<Course> searchByName(String courseName);

    List<Course> searchStudied(String id);

}