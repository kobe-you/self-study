package cn.kobe.controller;

import cn.kobe.bean.Teacher;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.TeacherService;
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
 * @Date: 2020/2/14 21:05
 * @Describe
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Teacher> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Teacher> pageResult = new PageResult<Teacher>();
        List<Teacher> teachers = teacherService.selectAll(pageNumber, pageSize);
        pageResult.setData(teachers);
        pageResult.setCode("200");
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String teacherId) {
        int i = teacherService.deleteByPrimaryKey(teacherId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Teacher teacher) {
        int insert = teacherService.insert(teacher);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Teacher teacher) {
        int result = teacherService.updateByPrimaryKey(teacher);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Teacher> selectByPrimaryKey(@PathVariable("id") String teacherId) {
        Teacher teacher = teacherService.selectByPrimaryKey(teacherId);
        if(teacher != null) {
            return new Result<Teacher>(Status.SUCCESS, "success", teacher);
        }
        return new Result<Teacher>(Status.SYSTEM_OF_ERROR, "system of error",teacher);
    }
}
