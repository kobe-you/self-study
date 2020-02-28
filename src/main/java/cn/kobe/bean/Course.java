package cn.kobe.bean;

import java.util.Date;

public class Course {
    private String courseId;

    private String courseName;

    private String coursePicture;

    private String courseDescribe;

    private String courseType;

    private String teacherId;

    private String courseBaiduUrl;

    private String courseLevel;

    private String courseBasics;

    private String courseSoftware;

    private String courseCate;

    private Date courseCreatetime;

    private Boolean isDelete;

    private Date courseDeletetime;

    public String getCourseCate() {
        return courseCate;
    }

    public void setCourseCate(String courseCate) {
        this.courseCate = courseCate;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCoursePicture() {
        return coursePicture;
    }

    public void setCoursePicture(String coursePicture) {
        this.coursePicture = coursePicture == null ? null : coursePicture.trim();
    }

    public String getCourseDescribe() {
        return courseDescribe;
    }

    public void setCourseDescribe(String courseDescribe) {
        this.courseDescribe = courseDescribe == null ? null : courseDescribe.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getCourseBaiduUrl() {
        return courseBaiduUrl;
    }

    public void setCourseBaiduUrl(String courseBaiduUrl) {
        this.courseBaiduUrl = courseBaiduUrl == null ? null : courseBaiduUrl.trim();
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel == null ? null : courseLevel.trim();
    }

    public String getCourseBasics() {
        return courseBasics;
    }

    public void setCourseBasics(String courseBasics) {
        this.courseBasics = courseBasics == null ? null : courseBasics.trim();
    }

    public String getCourseSoftware() {
        return courseSoftware;
    }

    public void setCourseSoftware(String courseSoftware) {
        this.courseSoftware = courseSoftware == null ? null : courseSoftware.trim();
    }

    public Date getCourseCreatetime() {
        return courseCreatetime;
    }

    public void setCourseCreatetime(Date courseCreatetime) {
        this.courseCreatetime = courseCreatetime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCourseDeletetime() {
        return courseDeletetime;
    }

    public void setCourseDeletetime(Date courseDeletetime) {
        this.courseDeletetime = courseDeletetime;
    }
}