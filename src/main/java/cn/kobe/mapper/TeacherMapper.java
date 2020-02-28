package cn.kobe.mapper;

import cn.kobe.bean.Teacher;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int deleteByPrimaryKey(@Param("teacherId") String teacherId);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(@Param("teacherId") String teacherId);

    List<Teacher> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Teacher record);

    List<Teacher> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    List<Teacher> searchTopTeacher();

    Teacher selectByAccount(String acount);

    Integer getMoney(String id);
}