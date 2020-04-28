package cn.kobe.mapper;

import cn.kobe.bean.Collection;
import cn.kobe.bean.Course;
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

    List<Collection> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    Integer startCollection(String s);

    Integer banCollection(String s);

    List<Collection> isCollected(@Param("studentId")String studentId, @Param("courseId")String courseId);

}