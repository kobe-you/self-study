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
        record.setStudentId(record.getStudentAccount());
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

    @Override
    public Integer selectCounts() {
        return studentMapper.selectCounts();
    }

    @Override
    public List<Student> selectByName(String name, Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Student> students = studentMapper.selectByName(name, pageNumber, pageSize);
        return students;
    }

    @Override
    public Integer deleteImg(String id) {
        Integer i = studentMapper.deleteImg(id);
        return i;
    }

    @Override
    public Student login(String account, String password) {
        Student student = studentMapper.login(account, password);
        return student;
    }

    @Override
    public Integer updateCoinById(String studentId, float v) {
        Integer i = studentMapper.updateCoinById(studentId, v);
        return i;
    }

    @Override
    public Integer getRank(String studentId) {
        Integer rank = studentMapper.getRank(studentId);
        return rank;
    }

    @Override
    public Integer getCounts() {
        Integer counts = studentMapper.getCounts();
        return counts;
    }
}
