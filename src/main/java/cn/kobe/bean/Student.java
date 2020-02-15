package cn.kobe.bean;

import java.util.Date;

public class Student {
    private String studentId;

    private String studentAccount;

    private String studentName;

    private String studentPassword;

    private String studentPhone;

    private String studentSex;

    private Integer studentCoin;

    private String studentEmail;

    private Boolean isDelete;

    private Date studentCreatetime;

    private Date studentDeletetime;

    private String studentImg;

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(String studentImg) {
        this.studentImg = studentImg;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentAccount() {
        return studentAccount;
    }

    public void setStudentAccount(String studentAccount) {
        this.studentAccount = studentAccount == null ? null : studentAccount.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword == null ? null : studentPassword.trim();
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone == null ? null : studentPhone.trim();
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex == null ? null : studentSex.trim();
    }

    public Integer getStudentCoin() {
        return studentCoin;
    }

    public void setStudentCoin(Integer studentCoin) {
        this.studentCoin = studentCoin;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail == null ? null : studentEmail.trim();
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getStudentCreatetime() {
        return studentCreatetime;
    }

    public void setStudentCreatetime(Date studentCreatetime) {
        this.studentCreatetime = studentCreatetime;
    }

    public Date getStudentDeletetime() {
        return studentDeletetime;
    }

    public void setStudentDeletetime(Date studentDeletetime) {
        this.studentDeletetime = studentDeletetime;
    }
}