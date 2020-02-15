package cn.kobe.service;

import cn.kobe.bean.Student;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 13:30
 * @Describe
 */
public interface StudentService {
    int deleteByPrimaryKey(String studentId);

    int insert(Student record);

    Student selectByPrimaryKey(String studentId);

    List<Student> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Student record);
}
