package cn.kobe.mapper;

import cn.kobe.bean.Look;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LookMapper {
    int deleteByPrimaryKey(String lookId);

    int insert(Look record);

    Look selectByPrimaryKey(String lookId);

    List<Look> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Look record);
}