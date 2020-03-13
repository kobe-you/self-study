package cn.kobe.mapper;

import cn.kobe.bean.Carousel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarouselMapper {
    int deleteByPrimaryKey(String carouselId);

    int insert(Carousel record);

    Carousel selectByPrimaryKey(String carouselId);

    List<Carousel> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Carousel record);

    List<Carousel> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    Integer updateIsDelete(String s);

    Integer updateDelete(String s);
}