package cn.kobe.service.impl;

import cn.kobe.bean.Teacher;
import cn.kobe.mapper.TeacherMapper;
import cn.kobe.service.TeacherService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 21:07
 * @Describe
 */
@Service("TeacherService")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();
    @Override
    public int deleteByPrimaryKey(String teacherId) {
        int i = teacherMapper.deleteByPrimaryKey(teacherId);
        return i;
    }

    @Override
    public int insert(Teacher record) {
        record.setTeacherId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = teacherMapper.insert(record);
        return insert;
    }

    @Override
    public Teacher selectByPrimaryKey(String teacherId) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(teacherId);
        return teacher;
    }

    @Override
    public List<Teacher> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Teacher> teachers = teacherMapper.selectAll(pageNumber, pageSize);
        return teachers;
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        int i = teacherMapper.updateByPrimaryKey(record);
        return i;
    }
}
