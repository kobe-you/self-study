package cn.kobe.mapper;

import cn.kobe.bean.Pay;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayMapper {
    int deleteByPrimaryKey(String payId);

    int insert(Pay record);

    Pay selectByPrimaryKey(String payId);

    List<Pay> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Pay record);

    List<Pay> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);
}