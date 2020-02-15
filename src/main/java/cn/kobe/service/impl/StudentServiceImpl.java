package cn.kobe.service.impl;

import cn.kobe.bean.Student;
import cn.kobe.mapper.StudentMapper;
import cn.kobe.service.StudentService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 13:31
 * @Describe
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();
    @Override
    public int deleteByPrimaryKey(String studentId) {
        return studentMapper.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(Student record) {
        record.setStudentId(Long.toString(snowflakeIdWorker.nextId()));
        record.setStudentCreatetime(new Date());
        int i = studentMapper.insert(record);
        return i;
    }

    @Override
    public Student selectByPrimaryKey(String studentId) {
        Student student = studentMapper.selectByPrimaryKey(studentId);
        return student;
    }

    @Override
    public List<Student> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Student> students = studentMapper.selectAll(pageNumber, pageSize);
        return students;
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        int i = studentMapper.updateByPrimaryKey(record);
        return i;
    }
}
