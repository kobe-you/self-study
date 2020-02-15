package cn.kobe.mapper;

import cn.kobe.bean.Collection;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectionMapper {
    int deleteByPrimaryKey(String collectionId);

    int insert(Collection record);

    Collection selectByPrimaryKey(String collectionId);

    List<Collection> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Collection record);
}