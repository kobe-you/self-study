package cn.kobe.entity;

import java.util.Date;

/**
 * 老师实体
 */
public class Teacher {
    private String teacher_id;
    private String teacher_account;
    private String teacher_name;
    private String teacher_password;
    private String teacher_sex;
    private String teacher_phone;
    private String teacher_email;
    private boolean is_delete;
    private Date teacher_createtime;
    private Date teacher_deletetime;

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_account() {
        return teacher_account;
    }

    public void setTeacher_account(String teacher_account) {
        this.teacher_account = teacher_account;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_password() {
        return teacher_password;
    }

    public void setTeacher_password(String teacher_password) {
        this.teacher_password = teacher_password;
    }

    public String getTeacher_sex() {
        return teacher_sex;
    }

    public void setTeacher_sex(String teacher_sex) {
        this.teacher_sex = teacher_sex;
    }

    public String getTeacher_phone() {
        return teacher_phone;
    }

    public void setTeacher_phone(String teacher_phone) {
        this.teacher_phone = teacher_phone;
    }

    public String getTeacher_email() {
        return teacher_email;
    }

    public void setTeacher_email(String teacher_email) {
        this.teacher_email = teacher_email;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Date getTeacher_createtime() {
        return teacher_createtime;
    }

    public void setTeacher_createtime(Date teacher_createtime) {
        this.teacher_createtime = teacher_createtime;
    }

    public Date getTeacher_deletetime() {
        return teacher_deletetime;
    }

    public void setTeacher_deletetime(Date teacher_deletetime) {
        this.teacher_deletetime = teacher_deletetime;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id='" + teacher_id + '\'' +
                ", teacher_account='" + teacher_account + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                ", teacher_password='" + teacher_password + '\'' +
                ", teacher_sex='" + teacher_sex + '\'' +
                ", teacher_phone='" + teacher_phone + '\'' +
                ", teacher_email='" + teacher_email + '\'' +
                ", is_delete=" + is_delete +
                ", teacher_createtime=" + teacher_createtime +
                ", teacher_deletetime=" + teacher_deletetime +
                '}';
    }
}
