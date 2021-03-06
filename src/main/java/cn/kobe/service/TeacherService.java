package cn.kobe.service;

import cn.kobe.bean.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 21:06
 * @Describe
 */
@Repository
public interface TeacherService {
    int deleteByPrimaryKey(@Param("teacherId") String teacherId);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(@Param("teacherId") String teacherId);

    List<Teacher> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Teacher record);

    List<Teacher> selectByName(String name, Integer pageNumber, Integer pageSize);

    List<Teacher> searchTopTeacher();

    Teacher selectByAccount(String acount);

    Integer getMoney(String id);

    Integer getCounts();

    Integer startTeacher(String s);

    Integer banTeacher(String s);
}
