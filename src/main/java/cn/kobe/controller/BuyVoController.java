package cn.kobe.controller;

import cn.kobe.bean.Buy;
import cn.kobe.beanVo.BuyVo;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.BuyService;
import cn.kobe.service.BuyVoService;
import cn.kobe.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/buyVo")
public class BuyVoController {
    @Autowired
    private BuyVoService buyVoService;

    @RequestMapping("/searchSuccessBuy/{id}")
    @ResponseBody
    public PageResult<BuyVo> searchSuccessBuy(@PathVariable("id") String id) {
        System.out.println(id);
        List<BuyVo> buys = buyVoService.searchSuccessBuy(id);
        System.out.println(buys);
        PageResult<BuyVo> pageResult = new PageResult<BuyVo>();
        pageResult.setData(buys);
        pageResult.setCode("200");
        pageResult.setTotal(buys.size());
        return pageResult;
    }
}
