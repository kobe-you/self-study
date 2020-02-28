package cn.kobe.controller;

import cn.kobe.bean.Buy;
import cn.kobe.bean.Lesson;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.LessonService;
import cn.kobe.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:11
 * @Describe
 */
@Controller
@RequestMapping("/lesson")
public class LessonController {
    @Autowired
    private LessonService lessonService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Lesson> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Lesson> pageResult = new PageResult<Lesson>();
        List<Lesson> lessons = lessonService.selectAll(pageNumber, pageSize);
        pageResult.setData(lessons);
        pageResult.setCode("200");
        pageResult.setTotal(lessons.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String lessonId) {
        int i = lessonService.deleteByPrimaryKey(lessonId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Lesson lesson) {
        lesson.setLessonCreatetime(new Date());
        int insert = lessonService.insert(lesson);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Lesson lesson) {
        int result = lessonService.updateByPrimaryKey(lesson);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Lesson> selectByPrimaryKey(@PathVariable("id") String lessonId) {
        System.out.println(lessonId);
        Lesson lesson = lessonService.selectByPrimaryKey(lessonId);
        System.out.println(lesson);
        if(lesson != null) {
            return new Result<Lesson>(Status.SUCCESS, "success", lesson);
        }
        return new Result<Lesson>(Status.SYSTEM_OF_ERROR, "system of error",lesson);
    }

    @RequestMapping("/search/{name}/{page}/{size")
    @ResponseBody
    public PageResult<Lesson> selectByName(@PathVariable("name") String name, @PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Lesson> pageResult = new PageResult<Lesson>();
        List<Lesson> lessons = lessonService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(lessons);
        pageResult.setCode("200");
        pageResult.setTotal(lessons.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/selectByCourseId/{id}")
    @ResponseBody
    public PageResult<Lesson> selectByCourseId(@PathVariable("id") String id) {
        PageResult<Lesson> pageResult = new PageResult<Lesson>();
        List<Lesson> lessons = lessonService.selectByCourseId(id);
        pageResult.setData(lessons);
        pageResult.setCode("200");
        return pageResult;
    }
}
