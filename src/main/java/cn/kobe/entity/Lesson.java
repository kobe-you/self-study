package cn.kobe.entity;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/1/20 0:12
 * @Describe
 */
public class Lesson {
    private String lesson_id;
    private String lesson_name;
    private String course_id;
    private int lesson_coin;
    private int lesson_count;
    private Date lesson_createtime;
    private boolean is_delete;
    private Date lesson_deletetime;

    public String getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(String lesson_id) {
        this.lesson_id = lesson_id;
    }

    public String getLesson_name() {
        return lesson_name;
    }

    public void setLesson_name(String lesson_name) {
        this.lesson_name = lesson_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public int getLesson_coin() {
        return lesson_coin;
    }

    public void setLesson_coin(int lesson_coin) {
        this.lesson_coin = lesson_coin;
    }

    public int getLesson_count() {
        return lesson_count;
    }

    public void setLesson_count(int lesson_count) {
        this.lesson_count = lesson_count;
    }

    public Date getLesson_createtime() {
        return lesson_createtime;
    }

    public void setLesson_createtime(Date lesson_createtime) {
        this.lesson_createtime = lesson_createtime;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Date getLesson_deletetime() {
        return lesson_deletetime;
    }

    public void setLesson_deletetime(Date lesson_deletetime) {
        this.lesson_deletetime = lesson_deletetime;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lesson_id='" + lesson_id + '\'' +
                ", lesson_name='" + lesson_name + '\'' +
                ", course_id='" + course_id + '\'' +
                ", lesson_coin=" + lesson_coin +
                ", lesson_count=" + lesson_count +
                ", lesson_createtime=" + lesson_createtime +
                ", is_delete=" + is_delete +
                ", lesson_deletetime=" + lesson_deletetime +
                '}';
    }
}
