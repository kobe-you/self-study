package cn.kobe.entity;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/1/20 21:01
 * @Describe
 */
public class Buy {
    private String buy_id;
    private String course_id;
    private String student_id;
    private Date buy_createtime;

    public String getBuy_id() {
        return buy_id;
    }

    public void setBuy_id(String buy_id) {
        this.buy_id = buy_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public Date getBuy_createtime() {
        return buy_createtime;
    }

    public void setBuy_createtime(Date buy_createtime) {
        this.buy_createtime = buy_createtime;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "buy_id='" + buy_id + '\'' +
                ", course_id='" + course_id + '\'' +
                ", student_id='" + student_id + '\'' +
                ", buy_createtime=" + buy_createtime +
                '}';
    }
}
