package cn.kobe.controller;

import cn.kobe.bean.Admin;
import cn.kobe.bean.Buy;
import cn.kobe.beanVo.BuyVo;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.BuyService;
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
 * @Date: 2020/2/14 18:43
 * @Describe
 */
@Controller
@RequestMapping("/buy")
public class BuyController {
    @Autowired
    private BuyService buyService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Buy> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Buy> pageResult = new PageResult<Buy>();
        List<Buy> buys = buyService.selectAll(pageNumber, pageSize);
        pageResult.setData(buys);
        pageResult.setCode("200");
        pageResult.setTotal(buys.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String buyId) {
        int i = buyService.deleteByPrimaryKey(buyId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Buy buy) {
        int insert = buyService.insert(buy);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Buy buy) {
        int result = buyService.updateByPrimaryKey(buy);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Buy> selectByPrimaryKey(@PathVariable("id") String buyId) {
        Buy buy = buyService.selectByPrimaryKey(buyId);
        if(buy != null) {
            return new Result<Buy>(Status.SUCCESS, "success", buy);
        }
        return new Result<Buy>(Status.SYSTEM_OF_ERROR, "system of error",buy);
    }

    @RequestMapping("/searchByName/{name}/{page}/{size")
    @ResponseBody
    public PageResult<Buy> selectByName(@PathVariable("name") String name, @PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Buy> pageResult = new PageResult<Buy>();
        name = "%" + name + "%";
        List<Buy> buys = buyService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(buys);
        pageResult.setCode("200");
        pageResult.setTotal(buys.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

//    @RequestMapping("/searchSuccessBuy/{id}")
//    @ResponseBody
//    public PageResult<BuyVo> searchSuccessBuy(@PathVariable("id") String id) {
//        System.out.println(id);
//        List<BuyVo> buys = buyService.searchSuccessBuy(id);
//        System.out.println(buys);
//        PageResult<BuyVo> pageResult = new PageResult<BuyVo>();
//        pageResult.setData(buys);
//        pageResult.setCode("200");
//        pageResult.setTotal(buys.size());
//        return pageResult;
//    }
}
