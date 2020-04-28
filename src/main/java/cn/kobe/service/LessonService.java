package cn.kobe.service;

import cn.kobe.bean.Course;
import cn.kobe.bean.Lesson;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:12
 * @Describe
 */
public interface LessonService {
    int deleteByPrimaryKey(String lessonId);

    int insert(Lesson record);

    Lesson selectByPrimaryKey(String lessonId);

    List<Lesson> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Lesson record);

    List<Lesson> selectByName(String name, Integer pageNumber, Integer pageSize);

    List<Lesson> selectByCourseId(String id);

    Integer startLesson(String s);

    Integer banLesson(String s);
}
