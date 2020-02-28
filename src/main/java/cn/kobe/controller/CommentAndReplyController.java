package cn.kobe.controller;

import cn.kobe.bean.Collection;
import cn.kobe.beanVo.CommentAndReply;
import cn.kobe.dto.PageResult;
import cn.kobe.service.CommentAndReplyService;
import cn.kobe.service.CommentService;
import cn.kobe.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/27 22:23
 * @Describe
 */
@Controller
@RequestMapping("/comment")
public class CommentAndReplyController {
    @Autowired
    private CommentAndReplyService commentAndReplyService;

    @RequestMapping("/allComment/{courseId}")
    @ResponseBody
    public PageResult<CommentAndReply> selectAllComment(@PathVariable("courseId") String courseId) {
        PageResult<CommentAndReply> pageResult = new PageResult<CommentAndReply>();
        List<CommentAndReply> commentAndReplies = commentAndReplyService.selectAllComment(courseId);
        pageResult.setData(commentAndReplies);
        pageResult.setTotal(commentAndReplies.size());
        pageResult.setCode(Status.SUCCESS);
        return pageResult;
    }
}
