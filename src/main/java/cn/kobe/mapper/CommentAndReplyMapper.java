package cn.kobe.mapper;

import cn.kobe.beanVo.CommentAndReply;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/27 22:25
 * @Describe
 */
@Repository
public interface CommentAndReplyMapper {
    List<CommentAndReply> selectAllComment(String courseId);
}
