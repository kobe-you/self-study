package cn.kobe.controller;

import cn.kobe.bean.Buy;
import cn.kobe.bean.Look;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.LookService;
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
 * @Date: 2020/2/14 20:37
 * @Describe
 */
@Controller
@RequestMapping("/look")
public class LookController {
    @Autowired
    private LookService lookService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Look> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Look> pageResult = new PageResult<Look>();
        List<Look> looks = lookService.selectAll(pageNumber, pageSize);
        pageResult.setData(looks);
        pageResult.setCode("200");
        pageResult.setTotal(looks.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String lookId) {
        int i = lookService.deleteByPrimaryKey(lookId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Look look) {
        look.setLookCreatetime(new Date());
        int insert = lookService.insert(look);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Look look) {
        int result = lookService.updateByPrimaryKey(look);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Look> selectByPrimaryKey(@PathVariable("id") String lookId) {
        Look look = lookService.selectByPrimaryKey(lookId);
        if(look != null) {
            return new Result<Look>(Status.SUCCESS, "success", look);
        }
        return new Result<Look>(Status.SYSTEM_OF_ERROR, "system of error",look);
    }

    @RequestMapping("/searchByName/{name}/{page}/{size")
    @ResponseBody
    public PageResult<Look> selectByName(@PathVariable("name") String name, @PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Look> pageResult = new PageResult<Look>();
        name = "%" + name + "%";
        List<Look> looks = lookService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(looks);
        pageResult.setCode("200");
        pageResult.setTotal(looks.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    /**
        检查是否看过
     */
    @RequestMapping("/selectLook/{lessonId}/{studentId}")
    @ResponseBody
    public Result<Look> selectLook(@PathVariable("lessonId") String lessonId, @PathVariable("studentId") String studentId) {
        Look look = lookService.selectLook(lessonId, studentId);
        System.out.println(look+""+lessonId+""+studentId);
        if(look != null) {
            return new Result<Look>(Status.SUCCESS, "success", look);
        }
        return new Result<Look>(Status.SYSTEM_OF_ERROR, "system of error",look);
    }
}
