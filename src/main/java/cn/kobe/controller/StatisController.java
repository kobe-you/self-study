package cn.kobe.controller;

import cn.kobe.beanVo.Trend;
import cn.kobe.dto.Result;
import cn.kobe.service.CourseService;
import cn.kobe.service.StudentService;
import cn.kobe.service.TeacherService;
import cn.kobe.service.TrendService;
import cn.kobe.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/3/1 18:32
 * @Describe
 */
@Controller
@RequestMapping("/statis")
public class StatisController {
    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;


    @RequestMapping("/counts")
    @ResponseBody
    public Result<List<Integer>> getCounts() {
        Integer counts1 = teacherService.getCounts();
        Integer counts2 = studentService.getCounts();
        Integer counts3 = courseService.getCounts();
        List<Integer> list = new ArrayList<Integer>();
        list.add(counts1);
        list.add(counts2);
        list.add(counts3);
        return new Result<List<Integer>>(Status.SUCCESS, "success",list);
    }
}
