package cn.kobe.controller;

import cn.kobe.bean.Buy;
import cn.kobe.bean.Comment;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.CommentService;
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
 * @Date: 2020/2/14 19:39
 * @Describe
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Comment> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Comment> pageResult = new PageResult<Comment>();
        List<Comment> comments = commentService.selectAll(pageNumber, pageSize);
        pageResult.setData(comments);
        pageResult.setCode("200");
        pageResult.setTotal(comments.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String commentId) {
        int i = commentService.deleteByPrimaryKey(commentId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Comment comment) {
        comment.setCommentCreatetime(new Date());
        System.out.println(comment.getCommentCreatetime());
        int insert = commentService.insert(comment);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Comment comment) {
        int result = commentService.updateByPrimaryKey(comment);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Comment> selectByPrimaryKey(@PathVariable("id") String commentId) {
        Comment comment = commentService.selectByPrimaryKey(commentId);
        if(comment != null) {
            return new Result<Comment>(Status.SUCCESS, "success", comment);
        }
        return new Result<Comment>(Status.SYSTEM_OF_ERROR, "system of error",comment);
    }

    @RequestMapping("/search/{name}/{page}/{size")
    @ResponseBody
    public PageResult<Comment> selectByName(@PathVariable("name") String name, @PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Comment> pageResult = new PageResult<Comment>();
        List<Comment> comments = commentService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(comments);
        pageResult.setCode("200");
        pageResult.setTotal(comments.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }
}
