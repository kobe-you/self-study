package cn.kobe.service;

import cn.kobe.bean.Carousel;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 19:02
 * @Describe
 */
public interface CarouselService {
    int deleteByPrimaryKey(String carouselId);

    int insert(Carousel record);

    Carousel selectByPrimaryKey(String carouselId);

    List<Carousel> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Carousel record);

    List<Carousel> selectByName(String name, Integer pageNumber, Integer pageSize);
}
