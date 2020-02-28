package cn.kobe.service.impl;

import cn.kobe.beanVo.CommentAndReply;
import cn.kobe.mapper.CommentAndReplyMapper;
import cn.kobe.service.CommentAndReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/27 22:27
 * @Describe
 */
@Service("CommentAndReplyService")
public class CommentAndReplyServiceImpl implements CommentAndReplyService {
    @Autowired
    private CommentAndReplyMapper commentAndReplyMapper;
    @Override
    public List<CommentAndReply> selectAllComment(String courseId) {
        List<CommentAndReply> commentAndReplies = commentAndReplyMapper.selectAllComment(courseId);
        return commentAndReplies;
    }
}
