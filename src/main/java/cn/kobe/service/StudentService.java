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

    Integer selectCounts();

    List<Student> selectByName(String name, Integer pageNumber, Integer pageSize);

    Integer deleteImg(String id);

    Student login(String account, String password);

    Integer updateCoinById(String studentId, float v);

    Integer getRank(String studentId);

    Integer getCounts();

    Integer isRegist(String studentId);

    Integer startStudent(String s);

    Integer banStudent(String s);
}
