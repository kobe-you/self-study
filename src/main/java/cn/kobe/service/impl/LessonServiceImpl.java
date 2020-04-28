package cn.kobe.service.impl;

import cn.kobe.bean.Course;
import cn.kobe.bean.Lesson;
import cn.kobe.mapper.LessonMapper;
import cn.kobe.service.LessonService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:26
 * @Describe
 */
@Service("lessonService")
public class LessonServiceImpl implements LessonService {
    @Autowired
    private LessonMapper lessonMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

    @Override
    public int deleteByPrimaryKey(String lessonId) {
        int i = lessonMapper.deleteByPrimaryKey(lessonId);
        return i;
    }

    @Override
    public int insert(Lesson record) {
        record.setLessonId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = lessonMapper.insert(record);
        return insert;
    }

    @Override
    public Lesson selectByPrimaryKey(String lessonId) {
        Lesson lesson = lessonMapper.selectByPrimaryKey(lessonId);
        return lesson;
    }

    @Override
    public List<Lesson> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Lesson> lessons = lessonMapper.selectAll(pageNumber, pageSize);
        return lessons;
    }

    @Override
    public int updateByPrimaryKey(Lesson record) {
        int i = lessonMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public List<Lesson> selectByName(String name, Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Lesson> lessons = lessonMapper.selectByName(name, pageNumber, pageSize);
        return lessons;
    }

    @Override
    public List<Lesson> selectByCourseId(String id) {
        List<Lesson> lessons = lessonMapper.selectByCourseId(id);
        return lessons;
    }

    @Override
    public Integer startLesson(String s) {
        Integer integer = lessonMapper.startLesson(s);
        return integer;
    }

    @Override
    public Integer banLesson(String s) {
        Integer integer = lessonMapper.banLesson(s);
        return integer;
    }
}
