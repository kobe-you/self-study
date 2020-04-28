package cn.kobe.service;

import cn.kobe.bean.Reply;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:58
 * @Describe
 */
@Repository
public interface ReplyService {
    int deleteByPrimaryKey(String replyId);

    int insert(Reply record);

    Reply selectByPrimaryKey(String replyId);

    List<Reply> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Reply record);

    List<Reply> selectByName(String name, Integer pageNumber, Integer pageSize);

    Integer startReply(String s);

    Integer banReply(String s);
}
