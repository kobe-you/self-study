package cn.kobe.service.impl;

import cn.kobe.beanVo.Trend;
import cn.kobe.mapper.TrendMapper;
import cn.kobe.service.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/3/1 19:03
 * @Describe
 */
@Service("trendService")
public class TrendServiceImpl implements TrendService {
    @Autowired
    private TrendMapper trendMapper;
    @Override
    public List<Trend> getTrend() {
        List<Trend> trends = trendMapper.getTrend();
        return trends;
    }

    @Override
    public List<Trend> getMoneyTrend() {
        List<Trend> trends = trendMapper.getMoneyTrend();
        return trends;
    }

    @Override
    public List<Trend> getPlayCounts(String courseId) {
        List<Trend> playCounts = trendMapper.getPlayCounts(courseId);
        return playCounts;
    }
}
