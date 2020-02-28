package cn.kobe.controller;

import cn.kobe.bean.Student;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.StudentService;
import cn.kobe.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 13:28
 * @Describe
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentServicc;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    @CrossOrigin
    public PageResult<Student> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        System.out.println("kobe bryant");
        pageNumber--;
        PageResult<Student> pageResult = new PageResult<Student>();
        List<Student> students = studentServicc.selectAll(pageNumber, pageSize);
        pageResult.setData(students);
        pageResult.setCode("200");
        pageResult.setTotal(this.selectCounts());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }
//    @RequestMapping("/count")
//    @ResponseBody
    public Integer selectCounts() {
        return studentServicc.selectCounts();
    }
    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String studentId) {
        int i = studentServicc.deleteByPrimaryKey(studentId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Student student) {
        System.out.println("kobe");
        int insert = studentServicc.insert(student);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Student student) {
        System.out.println(student);
        int result = studentServicc.updateByPrimaryKey(student);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Student> selectByPrimaryKey(@PathVariable("id") String studentId) {
        Student student = studentServicc.selectByPrimaryKey(studentId);
        System.out.println(student);
        if(student != null) {
            return new Result<Student>(Status.SUCCESS, "success", student);
        }
        return new Result<Student>(Status.SYSTEM_OF_ERROR, "system of error",student);
    }

    @RequestMapping("/searchByName/{name}/{page}/{size}")
    @ResponseBody
    public PageResult<Student> selectByName(@PathVariable("name") String name,@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Student> pageResult = new PageResult<Student>();
        List<Student> students = studentServicc.selectByName(name, pageNumber, pageSize);
        pageResult.setData(students);
        pageResult.setCode("200");
        pageResult.setTotal(students.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/deleteImg/{id}")
    @ResponseBody
    public Result<String> deleteImg(@PathVariable("id") String id) {
        System.out.println(id);
        Integer i = studentServicc.deleteImg(id);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }
}