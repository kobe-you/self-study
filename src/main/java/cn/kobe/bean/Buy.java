package cn.kobe.bean;

import java.util.Date;

public class Buy {
    private String buyId;

    private String courseId;

    private String studentId;

    private Date buyCreatetime;

    public String getBuyId() {
        return buyId;
    }

    public void setBuyId(String buyId) {
        this.buyId = buyId == null ? null : buyId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Date getBuyCreatetime() {
        return buyCreatetime;
    }

    public void setBuyCreatetime(Date buyCreatetime) {
        this.buyCreatetime = buyCreatetime;
    }
}