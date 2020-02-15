package cn.kobe.controller;

import cn.kobe.bean.Carousel;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.CarouselService;
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
        pageResult.setData(carousels);
        pageResult.setCode("200");
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
}
