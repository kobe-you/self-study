package cn.kobe.mapper;

import cn.kobe.beanVo.Trend;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/3/1 19:01
 * @Describe
 */
@Repository
public interface TrendMapper {

    List<Trend> getTrend();

    List<Trend> getMoneyTrend();

    List<Trend> getPlayCounts(String courseId);
}
