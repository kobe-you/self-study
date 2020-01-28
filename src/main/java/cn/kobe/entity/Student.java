package cn.kobe.entity;

import java.util.Date;

public class Student {
    private String student_id;
    private String student_account;
    private String student_name;
    private String student_password;
    private String student_phone;
    private String student_sex;
    private int student_coin;
    private String student_email;
    private boolean is_delete;
    private Date student_createtime;
    private Date student_deletetime;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_account() {
        return student_account;
    }

    public void setStudent_account(String student_account) {
        this.student_account = student_account;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_password() {
        return student_password;
    }

    public void setStudent_password(String student_password) {
        this.student_password = student_password;
    }

    public String getStudent_phone() {
        return student_phone;
    }

    public void setStudent_phone(String student_phone) {
        this.student_phone = student_phone;
    }

    public String getStudent_sex() {
        return student_sex;
    }

    public void setStudent_sex(String student_sex) {
        this.student_sex = student_sex;
    }

    public int getStudent_coin() {
        return student_coin;
    }

    public void setStudent_coin(int student_coin) {
        this.student_coin = student_coin;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Date getStudent_createtime() {
        return student_createtime;
    }

    public void setStudent_createtime(Date student_createtime) {
        this.student_createtime = student_createtime;
    }

    public Date getStudent_deletetime() {
        return student_deletetime;
    }

    public void setStudent_deletetime(Date student_deletetime) {
        this.student_deletetime = student_deletetime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id='" + student_id + '\'' +
                ", student_account='" + student_account + '\'' +
                ", student_name='" + student_name + '\'' +
                ", student_password='" + student_password + '\'' +
                ", student_phone='" + student_phone + '\'' +
                ", student_sex='" + student_sex + '\'' +
                ", student_coin='" + student_coin + '\'' +
                ", student_email='" + student_email + '\'' +
                ", is_delete='" + is_delete + '\'' +
                ", student_createtime='" + student_createtime + '\'' +
                ", student_deletetime='" + student_deletetime + '\'' +
                '}';
    }
}
