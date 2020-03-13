package cn.kobe.mapper;

import cn.kobe.bean.Buy;
import cn.kobe.beanVo.BuyVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuyMapper {
    int deleteByPrimaryKey(String buyId);

    int insert(Buy record);

    Buy selectByPrimaryKey(String buyId);

    List<Buy> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Buy record);

    List<Buy> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

}