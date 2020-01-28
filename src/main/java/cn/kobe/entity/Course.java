package cn.kobe.entity;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/1/19 21:50
 * @Describe
 */
public class Course {
    private String course_id;
    private String course_name;
    private String course_picture;
    private String course_describe;
    private String course_type;
    private String teacher_id;
    private String course_baidu_url;
    private String course_level;
    private String course_basics;
    private String course_software;
    private Date course_createtime;
    private boolean is_delete;
    private Date course_deletetime;

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_picture() {
        return course_picture;
    }

    public void setCourse_picture(String course_picture) {
        this.course_picture = course_picture;
    }

    public String getCourse_describe() {
        return course_describe;
    }

    public void setCourse_describe(String course_describe) {
        this.course_describe = course_describe;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getCourse_baidu_url() {
        return course_baidu_url;
    }

    public void setCourse_baidu_url(String course_baidu_url) {
        this.course_baidu_url = course_baidu_url;
    }

    public String getCourse_level() {
        return course_level;
    }

    public void setCourse_level(String course_level) {
        this.course_level = course_level;
    }

    public String getCourse_basics() {
        return course_basics;
    }

    public void setCourse_basics(String course_basics) {
        this.course_basics = course_basics;
    }

    public String getCourse_software() {
        return course_software;
    }

    public void setCourse_software(String course_software) {
        this.course_software = course_software;
    }

    public Date getCourse_createtime() {
        return course_createtime;
    }

    public void setCourse_createtime(Date course_createtime) {
        this.course_createtime = course_createtime;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Date getCourse_deletetime() {
        return course_deletetime;
    }

    public void setCourse_deletetime(Date course_deletetime) {
        this.course_deletetime = course_deletetime;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id='" + course_id + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_picture='" + course_picture + '\'' +
                ", course_describe='" + course_describe + '\'' +
                ", course_type='" + course_type + '\'' +
                ", teacher_id='" + teacher_id + '\'' +
                ", course_baidu_url='" + course_baidu_url + '\'' +
                ", course_level='" + course_level + '\'' +
                ", course_basics='" + course_basics + '\'' +
                ", course_software='" + course_software + '\'' +
                ", course_createtime=" + course_createtime +
                ", is_delete=" + is_delete +
                ", course_deletetime=" + course_deletetime +
                '}';
    }
}
