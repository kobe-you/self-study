package cn.kobe.mapper;

import cn.kobe.bean.Reply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReplyMapper {
    int deleteByPrimaryKey(String replyId);

    int insert(Reply record);

    Reply selectByPrimaryKey(String replyId);

    List<Reply> selectAll(@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);

    int updateByPrimaryKey(Reply record);

    List<Reply> selectByName(@Param("name") String name,@Param("pageNumber")Integer pageNumber, @Param("pageSize")Integer pageSize);
}