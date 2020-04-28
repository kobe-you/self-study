package cn.kobe.controller;

import cn.kobe.bean.Buy;
import cn.kobe.bean.Carousel;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.CarouselService;
import cn.kobe.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 18:54
 * @Describe
 */
@Controller
@RequestMapping("/carousel")
public class CarouselController {
    @Autowired
    private CarouselService carouselService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Carousel> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Carousel> pageResult = new PageResult<Carousel>();
        List<Carousel> carousels = carouselService.selectAll(pageNumber, pageSize);
        for(Carousel carousel:carousels) {
            System.out.println(carousel.getIsDelete());
        }
        pageResult.setData(carousels);
        pageResult.setCode("200");
        pageResult.setTotal(carousels.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String carouselId) {
        int i = carouselService.deleteByPrimaryKey(carouselId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Carousel carousel) {
        int insert = carouselService.insert(carousel);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Carousel carousel) {
        int result = carouselService.updateByPrimaryKey(carousel);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Carousel> selectByPrimaryKey(@PathVariable("id") String carouselId) {
        Carousel carousel = carouselService.selectByPrimaryKey(carouselId);
        if(carousel != null) {
            return new Result<Carousel>(Status.SUCCESS, "success", carousel);
        }
        return new Result<Carousel>(Status.SYSTEM_OF_ERROR, "system of error",carousel);
    }

    @RequestMapping("/searchByName/{name}/{page}/{size}")
    @ResponseBody
    public PageResult<Carousel> selectByName(@PathVariable("name") String name, @PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Carousel> pageResult = new PageResult<Carousel>();
        name = "%" + name + "%";
        List<Carousel> carousels = carouselService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(carousels);
        pageResult.setCode("200");
        pageResult.setTotal(carousels.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/updateIsDelete")
    @ResponseBody
    public Result<String> updateIsDelete(@RequestBody String[] arr) {
        for(int i=0;i<arr.length;i++) {
            Integer result = carouselService.updateIsDelete(arr[i]);
        }
        System.out.println(arr);
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/updateDelete")
    @ResponseBody
    public Result<String> updateDelete(@RequestBody String[] arr) {
        for(int i=0;i<arr.length;i++) {
            Integer result = carouselService.updateDelete(arr[i]);
        }
        System.out.println(arr);
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }
}
