package cn.kobe.controller;

import cn.kobe.bean.Admin;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.AdminService;
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
 * @Date: 2020/2/14 11:44
 * @Describe
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Admin> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Admin> pageResult = new PageResult<Admin>();
        List<Admin> admins = adminService.selectAll(pageNumber, pageSize);
        pageResult.setData(admins);
        pageResult.setCode("200");
        pageResult.setTotal(admins.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String adminId) {
        int i = adminService.deleteByPrimaryKey(adminId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Admin admin) {
        int insert = adminService.insert(admin);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Admin admin) {
        int result = adminService.updateByPrimaryKey(admin);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Admin> selectByPrimaryKey(@PathVariable("id") String adminId) {
        Admin admin = adminService.selectByPrimaryKey(adminId);
        if(admin != null) {
            return new Result<Admin>(Status.SUCCESS, "success", admin);
        }
        return new Result<Admin>(Status.SYSTEM_OF_ERROR, "system of error",admin);
    }

    @RequestMapping("/searchByName/{name}/{page}/{size")
    @ResponseBody
    public PageResult<Admin> selectByName(@PathVariable("name") String name,@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Admin> pageResult = new PageResult<Admin>();
        name = "%" + name + "%";
        List<Admin> admins = adminService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(admins);
        pageResult.setCode("200");
        pageResult.setTotal(admins.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }
}
