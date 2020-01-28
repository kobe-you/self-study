package cn.kobe.entity;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/1/20 8:58
 * @Describe
 */
public class Reply {
    private String pay_time;
    private String reply_content;
    private Date reply_time;
    private String comment_id;
    private String replyer_id;
    private String relyered_id;

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getReply_content() {
        return reply_content;
    }

    public void setReply_content(String reply_content) {
        this.reply_content = reply_content;
    }

    public Date getReply_time() {
        return reply_time;
    }

    public void setReply_time(Date reply_time) {
        this.reply_time = reply_time;
    }

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    public String getReplyer_id() {
        return replyer_id;
    }

    public void setReplyer_id(String replyer_id) {
        this.replyer_id = replyer_id;
    }

    public String getRelyered_id() {
        return relyered_id;
    }

    public void setRelyered_id(String relyered_id) {
        this.relyered_id = relyered_id;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "pay_time='" + pay_time + '\'' +
                ", reply_content='" + reply_content + '\'' +
                ", reply_time=" + reply_time +
                ", comment_id='" + comment_id + '\'' +
                ", replyer_id='" + replyer_id + '\'' +
                ", relyered_id='" + relyered_id + '\'' +
                '}';
    }
}
