package cn.kobe.service;

import cn.kobe.beanVo.Trend;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/3/1 19:03
 * @Describe
 */
public interface TrendService {
    List<Trend> getTrend();

    List<Trend> getMoneyTrend();

    List<Trend> getPlayCounts(String courseId);
}
