package cn.kobe.service;

import cn.kobe.bean.Comment;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 19:41
 * @Describe
 */
public interface CommentService {
    int deleteByPrimaryKey(String commentId);

    int insert(Comment record);

    Comment selectByPrimaryKey(String commentId);

    List<Comment> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Comment record);

    List<Comment> selectByName(String name, Integer pageNumber, Integer pageSize);
}
