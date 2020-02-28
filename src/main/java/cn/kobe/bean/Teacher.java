package cn.kobe.bean;

import java.util.Date;

public class Teacher {
    private String teacherId;

    private String teacherAccount;

    private String teacherName;

    private String teacherPassword;

    private String teacherSex;

    private String teacherPhone;

    private String teacherEmail;

    private Boolean isDelete;

    private Date teacherCreatetime;

    private Date teacherDeletetime;

    private String teacherImg;

    private String teacherDescribe;

    private String teacherFile;

    public String getTeacherFile() {
        return teacherFile;
    }

    public void setTeacherFile(String teacherFile) {
        this.teacherFile = teacherFile;
    }

    public String getTeacherDescribe() {
        return teacherDescribe;
    }

    public void setTeacherDescribe(String teacherDescribe) {
        this.teacherDescribe = teacherDescribe;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getTeacherImg() {
        return teacherImg;
    }

    public void setTeacherImg(String teacherImg) {
        this.teacherImg = teacherImg;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherAccount() {
        return teacherAccount;
    }

    public void setTeacherAccount(String teacherAccount) {
        this.teacherAccount = teacherAccount == null ? null : teacherAccount.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword == null ? null : teacherPassword.trim();
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex == null ? null : teacherSex.trim();
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone == null ? null : teacherPhone.trim();
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail == null ? null : teacherEmail.trim();
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getTeacherCreatetime() {
        return teacherCreatetime;
    }

    public void setTeacherCreatetime(Date teacherCreatetime) {
        this.teacherCreatetime = teacherCreatetime;
    }

    public Date getTeacherDeletetime() {
        return teacherDeletetime;
    }

    public void setTeacherDeletetime(Date teacherDeletetime) {
        this.teacherDeletetime = teacherDeletetime;
    }
}