package cn.kobe.mapper;

import cn.kobe.bean.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {
    int deleteByPrimaryKey(String adminAccount);

    int insert(Admin record);

    Admin selectByPrimaryKey(String adminAccount);

    List<Admin> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Admin record);

    List<Admin> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    Admin login(@Param("account") String account, @Param("password") String password);

}