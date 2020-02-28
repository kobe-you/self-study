package cn.kobe.service;

import cn.kobe.beanVo.CommentAndReply;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/27 22:26
 * @Describe
 */
public interface CommentAndReplyService {
    List<CommentAndReply> selectAllComment(String courseId);
}
