package cn.kobe.controller;

import cn.kobe.bean.Course;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.CourseService;
import cn.kobe.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 19:49
 * @Describe
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Course> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> courses = courseService.selectAll(pageNumber, pageSize);
        pageResult.setData(courses);
        pageResult.setCode("200");
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String courseId) {
        int i = courseService.deleteByPrimaryKey(courseId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Course course) {
        int insert = courseService.insert(course);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Course course) {
        int result = courseService.updateByPrimaryKey(course);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Course> selectByPrimaryKey(@PathVariable("id") String courseId) {
        Course course = courseService.selectByPrimaryKey(courseId);
        if(course != null) {
            return new Result<Course>(Status.SUCCESS, "success", course);
        }
        return new Result<Course>(Status.SYSTEM_OF_ERROR, "system of error",course);
    }
}
