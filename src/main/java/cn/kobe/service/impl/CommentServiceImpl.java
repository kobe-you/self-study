package cn.kobe.service.impl;

import cn.kobe.bean.Comment;
import cn.kobe.mapper.CommentMapper;
import cn.kobe.service.CommentService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 19:42
 * @Describe
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

    @Override
    public int deleteByPrimaryKey(String commentId) {
        int i = commentMapper.deleteByPrimaryKey(commentId);
        return i;
    }

    @Override
    public int insert(Comment record) {
        record.setCommentId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = commentMapper.insert(record);
        return insert;
    }

    @Override
    public Comment selectByPrimaryKey(String commentId) {
        Comment comment = commentMapper.selectByPrimaryKey(commentId);
        return comment;
    }

    @Override
    public List<Comment> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Comment> comments = commentMapper.selectAll(pageNumber, pageSize);
        return comments;
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        int i = commentMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public List<Comment> selectByName(String name, Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Comment> comments = commentMapper.selectByName(name, pageNumber, pageSize);
        return comments;
    }

    @Override
    public Integer startComment(String s) {
        Integer integer = commentMapper.startComment(s);
        return integer;
    }

    @Override
    public Integer banComment(String s) {
        Integer integer = commentMapper.banComment(s);
        return integer;
    }
}
