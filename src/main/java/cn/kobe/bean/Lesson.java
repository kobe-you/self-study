package cn.kobe.bean;

import java.util.Date;

public class Lesson {
    private String lessonId;

    private String lessonName;

    private String courseId;

    private Integer lessonCoin;

    private Integer lessonCount;

    private Date lessonCreatetime;

    private Boolean isDelete;

    private Date lessonDeletetime;

    private String lessonVideo;

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getLessonVideo() {
        return lessonVideo;
    }

    public void setLessonVideo(String lessonVideo) {
        this.lessonVideo = lessonVideo;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId == null ? null : lessonId.trim();
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName == null ? null : lessonName.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public Integer getLessonCoin() {
        return lessonCoin;
    }

    public void setLessonCoin(Integer lessonCoin) {
        this.lessonCoin = lessonCoin;
    }

    public Integer getLessonCount() {
        return lessonCount;
    }

    public void setLessonCount(Integer lessonCount) {
        this.lessonCount = lessonCount;
    }

    public Date getLessonCreatetime() {
        return lessonCreatetime;
    }

    public void setLessonCreatetime(Date lessonCreatetime) {
        this.lessonCreatetime = lessonCreatetime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getLessonDeletetime() {
        return lessonDeletetime;
    }

    public void setLessonDeletetime(Date lessonDeletetime) {
        this.lessonDeletetime = lessonDeletetime;
    }
}