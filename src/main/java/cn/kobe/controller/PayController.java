package cn.kobe.controller;

import cn.kobe.bean.Pay;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.PayService;
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
 * @Date: 2020/2/14 20:50
 * @Describe
 */
@Controller
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private PayService payService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Pay> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Pay> pageResult = new PageResult<Pay>();
        List<Pay> pays = payService.selectAll(pageNumber, pageSize);
        pageResult.setData(pays);
        pageResult.setCode("200");
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String payId) {
        int i = payService.deleteByPrimaryKey(payId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Pay pay) {
        int insert = payService.insert(pay);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Pay pay) {
        int result = payService.updateByPrimaryKey(pay);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Pay> selectByPrimaryKey(@PathVariable("id") String payId) {
        Pay pay = payService.selectByPrimaryKey(payId);
        if(pay != null) {
            return new Result<Pay>(Status.SUCCESS, "success", pay);
        }
        return new Result<Pay>(Status.SYSTEM_OF_ERROR, "system of error",pay);
    }
}
