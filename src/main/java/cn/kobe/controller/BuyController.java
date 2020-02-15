package cn.kobe.controller;

import cn.kobe.bean.Buy;
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
}
