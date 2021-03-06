package cn.kobe.mapper;

import cn.kobe.bean.Course;
import cn.kobe.bean.Lesson;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonMapper {
    int deleteByPrimaryKey(String lessonId);

    int insert(Lesson record);

    Lesson selectByPrimaryKey(String lessonId);

    List<Lesson> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Lesson record);

    List<Lesson> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    List<Lesson> selectByCourseId(String id);

    Integer startLesson(String s);

    Integer banLesson(String s);
}