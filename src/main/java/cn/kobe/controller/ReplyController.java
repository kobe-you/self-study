package cn.kobe.controller;

import cn.kobe.bean.Look;
import cn.kobe.bean.Reply;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.ReplyService;
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
 * @Date: 2020/2/14 20:57
 * @Describe
 */
@Controller
@RequestMapping("/reply")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Reply> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Reply> pageResult = new PageResult<Reply>();
        List<Reply> replies = replyService.selectAll(pageNumber, pageSize);
        pageResult.setData(replies);
        pageResult.setCode("200");
        pageResult.setTotal(replies.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String replyId) {
        int i = replyService.deleteByPrimaryKey(replyId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Reply reply) {
        reply.setReplyTime(new Date());
        int insert = replyService.insert(reply);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Reply reply) {
        int result = replyService.updateByPrimaryKey(reply);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Reply> selectByPrimaryKey(@PathVariable("id") String replyId) {
        Reply reply = replyService.selectByPrimaryKey(replyId);
        if(reply != null) {
            return new Result<Reply>(Status.SUCCESS, "success", reply);
        }
        return new Result<Reply>(Status.SYSTEM_OF_ERROR, "system of error",reply);
    }

    @RequestMapping("/searchByName/{name}/{page}/{size")
    @ResponseBody
    public PageResult<Reply> selectByName(@PathVariable("name") String name, @PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Reply> pageResult = new PageResult<Reply>();
        name = "%" + name + "%";
        List<Reply> replies = replyService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(replies);
        pageResult.setCode("200");
        pageResult.setTotal(replies.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/startReply")
    @ResponseBody
    public Result<String> startReply(@RequestBody String[] arr) {
        for(int i=0;i<arr.length;i++) {
            Integer result = replyService.startReply(arr[i]);
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/banLesson")
    @ResponseBody
    public Result<String> banReply(@RequestBody String[] arr) {
        for(int i=0;i<arr.length;i++) {
            Integer result = replyService.banReply(arr[i]);
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }
}
