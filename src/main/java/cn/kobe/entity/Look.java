package cn.kobe.entity;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/1/20 8:54
 * @Describe
 */
public class Look {
    private String look;
    private String lesson_id;
    private Date look_createtime;
    private String student_id;

    public String getLook() {
        return look;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public String getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(String lesson_id) {
        this.lesson_id = lesson_id;
    }

    public Date getLook_createtime() {
        return look_createtime;
    }

    public void setLook_createtime(Date look_createtime) {
        this.look_createtime = look_createtime;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Look{" +
                "look='" + look + '\'' +
                ", lesson_id='" + lesson_id + '\'' +
                ", look_createtime=" + look_createtime +
                ", student_id='" + student_id + '\'' +
                '}';
    }
}
