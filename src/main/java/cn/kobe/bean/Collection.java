package cn.kobe.bean;

import java.util.Date;

public class Collection {
    private String collectionId;

    private Date collectionTime;

    private String courseId;

    private String studentId;

    private Date collectionCreatetime;

    private Boolean isDelete;

    private Date collectionDeletetime;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId == null ? null : collectionId.trim();
    }

    public Date getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Date colectionTime) {
        this.collectionTime = colectionTime;
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

    public Date getCollectionCreatetime() {
        return collectionCreatetime;
    }

    public void setCollectionCreatetime(Date collectionCreatetime) {
        this.collectionCreatetime = collectionCreatetime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCollectionDeletetime() {
        return collectionDeletetime;
    }

    public void setCollectionDeletetime(Date collectionDeletetime) {
        this.collectionDeletetime = collectionDeletetime;
    }
}