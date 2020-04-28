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

    Integer selectCounts();

    List<Student> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    Integer deleteImg(String id);

    Student login(@Param("account")String account,@Param("password") String password);

    Integer updateCoinById(@Param("id") String studentId, @Param("v") float v);

    Integer getRank(String studentId);

    Integer getCounts();

    Integer isRegist(String studentId);

    Integer startStudent(String s);

    Integer banStudent(String s);
}