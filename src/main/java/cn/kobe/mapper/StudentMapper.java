package cn.kobe.mapper;

import cn.kobe.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(String studentId);

    int insert(Student record);

    Student selectByPrimaryKey(String studentId);

    List<Student> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Student record);
}