package cn.kobe.bean;

import java.util.Date;

public class Reply {
    private String replyId;

    private String replyContent;

    private Date replyTime;

    private String commentId;

    private String replyerId;

    private String relyeredId;

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getReplyerId() {
        return replyerId;
    }

    public void setReplyerId(String replyerId) {
        this.replyerId = replyerId == null ? null : replyerId.trim();
    }

    public String getRelyeredId() {
        return relyeredId;
    }

    public void setRelyeredId(String relyeredId) {
        this.relyeredId = relyeredId == null ? null : relyeredId.trim();
    }
}