package cn.kobe.controller;

import cn.kobe.beanVo.Trend;
import cn.kobe.dto.Result;
import cn.kobe.service.TrendService;
import cn.kobe.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/3/1 19:21
 * @Describe
 */
@Controller
@RequestMapping("/stati")
public class TrendController {
    @Autowired
    private TrendService trendService;


    @RequestMapping("/trend")
    @ResponseBody
    public Result<List<Trend>> getTrend() {
        System.out.println("kobe");
        List<Trend> trends = trendService.getTrend();
        return new Result<List<Trend>>(Status.SUCCESS, "success",trends);
    }

    @RequestMapping("/moneyTrend")
    @ResponseBody
    public Result<List<Trend>> getMoneyTrend() {
        System.out.println("kobe");
        List<Trend> trends = trendService.getMoneyTrend();
        return new Result<List<Trend>>(Status.SUCCESS, "success",trends);
    }

    @RequestMapping("/playCounts/{courseId}")
    @ResponseBody
    public Result<List<Trend>> getPlayCounts(@PathVariable("courseId") String courseId) {
        System.out.println("kobe");
        List<Trend> trends = trendService.getPlayCounts(courseId);
        for(Trend trend: trends) {
            System.out.println(trend);
        }
        return new Result<List<Trend>>(Status.SUCCESS, "success",trends);
    }
}
