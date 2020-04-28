package cn.kobe.controller;

import cn.kobe.bean.Buy;
import cn.kobe.bean.Course;
import cn.kobe.beanVo.CourseVo;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.CourseService;
import cn.kobe.service.CourseVoService;
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
 * @Date: 2020/2/14 19:49
 * @Describe
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private CourseVoService courseVoService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Course> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> courses = courseService.selectAll(pageNumber, pageSize);
        pageResult.setData(courses);
        pageResult.setCode("200");
        pageResult.setTotal(courses.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
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
        course.setCourseCreatetime(new Date());
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

    @RequestMapping("/search/{name}/{page}/{size")
    @ResponseBody
    public PageResult<Course> selectByName(@PathVariable("name") String name, @PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> courses = courseService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(courses);
        pageResult.setCode("200");
        pageResult.setTotal(courses.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/searchNewest")
    @ResponseBody
    public PageResult<Course> selectNewest() {
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> courses = courseService.selectNewest();
        pageResult.setData(courses);
        pageResult.setCode("200");
        return pageResult;
    }

    @RequestMapping("/searchTop")
    @ResponseBody
    public PageResult<Course> searchTop() {
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> courses = courseService.searchTop();
        pageResult.setData(courses);
        pageResult.setCode("200");
        return pageResult;
    }

    @RequestMapping("/searchTenCate")
    @ResponseBody
    public PageResult<Course> searchTenCate() {
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> courses = courseService.searchTenCate();
        pageResult.setData(courses);
        pageResult.setCode("200");
        System.out.println(courses.size());
        return pageResult;
    }

    @RequestMapping("/searchCate/{title}")
    @ResponseBody
    public PageResult<String> searchCate(@PathVariable("title") String title) {
        System.out.println(title);
        PageResult<String> pageResult = new PageResult<String>();
        List<String> courses = courseService.searchCate(title);
        pageResult.setData(courses);
        pageResult.setCode("200");
        return pageResult;
    }
    @RequestMapping("/searchAllCourse/{courseType}")
    @ResponseBody
    public PageResult<CourseVo> searchAllCourse(@PathVariable("courseType") String courseType) {
        System.out.println(courseType);
        PageResult<CourseVo> pageResult = new PageResult<CourseVo>();
        List<CourseVo> courses = courseVoService.searchAllCourse(courseType);
        pageResult.setData(courses);
        pageResult.setCode("200");
        return pageResult;
    }

    @RequestMapping("/getCourseStudent/{id}")
    @ResponseBody
    public Result<Integer> getCourseStudent(@PathVariable("id") String courseId) {
        Integer counts = courseService.getCourseStudent(courseId);
        if(counts >= 0) {
            return new Result<Integer>(Status.SUCCESS, "success", counts);
        }
        return new Result<Integer>(Status.SYSTEM_OF_ERROR, "system of error",counts);
    }

    @RequestMapping("/searchByNames/{courseName}")
    @ResponseBody
    public PageResult<CourseVo> searchByName(@PathVariable("courseName") String courseName) {
        PageResult<CourseVo> pageResult = new PageResult<CourseVo>();
        courseName = "%"+courseName+"%";
        List<CourseVo> courses = courseVoService.searchByName(courseName);
        pageResult.setData(courses);
        pageResult.setCode("200");
        pageResult.setTotal(courses.size());
        return pageResult;
    }

    @RequestMapping("/searchByTeacherId/{id}")
    @ResponseBody
    public PageResult<Course> searchByTeacherName(@PathVariable("id") String id) {
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> courses = courseService.searchByTeacherId(id);
        pageResult.setData(courses);
        pageResult.setCode("200");
        pageResult.setTotal(courses.size());
        return pageResult;
    }

    @RequestMapping("/searchStudied/{id}")
    @ResponseBody
    public PageResult<Course> searchStudied(@PathVariable("id") String id) {
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> courses = courseService.searchStudied(id);
        pageResult.setData(courses);
        pageResult.setCode("200");
        pageResult.setTotal(courses.size());
        return pageResult;
    }

    @RequestMapping("/searchByCateAndGrade/{cate}/{grade}/{sort}")
    @ResponseBody
    public PageResult<Course> searchByCateAndGrade(@PathVariable("cate") String cate, @PathVariable("grade") String grade, @PathVariable("sort") Integer sort) {
        PageResult<Course> pageResult = new PageResult<Course>();
        System.out.println(cate+" "+grade+" "+ sort);
        List<Course> courses = courseService.searchByCateAndGrade(cate, grade, sort);
        pageResult.setData(courses);
        pageResult.setCode("200");
        pageResult.setTotal(courses.size());
        return pageResult;
    }

    @RequestMapping("/getAllCourse")
    @ResponseBody
    public PageResult<Course> getAllCourse() {
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> courses = courseService.getAllCourse();
        pageResult.setData(courses);
        pageResult.setCode("200");
        pageResult.setTotal(courses.size());
        return pageResult;
    }

    @RequestMapping("/startCourse")
    @ResponseBody
    public Result<String> startCourse(@RequestBody String[] arr) {
        for(int i=0;i<arr.length;i++) {
            Integer result = courseService.startCourse(arr[i]);
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/banCourse")
    @ResponseBody
    public Result<String> banCourse(@RequestBody String[] arr) {
        for(int i=0;i<arr.length;i++) {
            Integer result = courseService.banCourse(arr[i]);
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/searchCollectedCourse/{studentId}")
    @ResponseBody
    public PageResult<Course> searchCollectedCourse(@PathVariable("studentId") String studentId ) {
        PageResult<Course> pageResult = new PageResult<Course>();
        List<Course> result = courseService.searchCollectedCourse(studentId);
        pageResult.setData(result);
        pageResult.setCode("200");
        pageResult.setTotal(result.size());
        return pageResult;
    }
}
