package cn.kobe.service.impl;

import cn.kobe.bean.Reply;
import cn.kobe.mapper.ReplyMapper;
import cn.kobe.service.ReplyService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 20:59
 * @Describe
 */
@Service("replyService")
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyMapper replyMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

    @Override
    public int deleteByPrimaryKey(String replyId) {
        int i = replyMapper.deleteByPrimaryKey(replyId);
        return i;
    }

    @Override
    public int insert(Reply record) {
        record.setReplyId(Long.toString(snowflakeIdWorker.nextId()));
        int insert = replyMapper.insert(record);
        return insert;
    }

    @Override
    public Reply selectByPrimaryKey(String replyId) {
        Reply reply = replyMapper.selectByPrimaryKey(replyId);
        return reply;
    }

    @Override
    public List<Reply> selectAll(Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Reply> replies = replyMapper.selectAll(pageNumber, pageSize);
        return replies;
    }

    @Override
    public int updateByPrimaryKey(Reply record) {
        int i = replyMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public List<Reply> selectByName(String name, Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Reply> replies = replyMapper.selectByName(name, pageNumber, pageSize);
        return replies;
    }
}
