package cn.kobe.service.impl;

import cn.kobe.bean.Carousel;
import cn.kobe.mapper.CarouselMapper;
import cn.kobe.service.CarouselService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 19:03
 * @Describe
 */
@Service("carouselService")
public class CarouselServiceImpl implements CarouselService {
    @Autowired
    private CarouselMapper carouselMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

    @Override
    public int deleteByPrimaryKey(String carouselId) {
        int i = carouselMapper.deleteByPrimaryKey(carouselId);
        return i;
    }

    @Override
    public int insert(Carousel record) {
        record.setCarouselId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = carouselMapper.insert(record);
        return insert;
    }

    @Override
    public Carousel selectByPrimaryKey(String carouselId) {
        Carousel carousel = carouselMapper.selectByPrimaryKey(carouselId);
        return carousel;
    }

    @Override
    public List<Carousel> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Carousel> carousels = carouselMapper.selectAll(pageNumber, pageSize);
        return carousels;
    }

    @Override
    public int updateByPrimaryKey(Carousel record) {
        int i = carouselMapper.updateByPrimaryKey(record);
        return i;
    }
}
