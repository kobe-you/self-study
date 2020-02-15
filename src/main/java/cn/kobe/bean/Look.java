package cn.kobe.bean;

import java.util.Date;

public class Look {
    private String lookId;

    private String lessonId;

    private Date lookCreatetime;

    private String studentId;

    public String getLookId() {
        return lookId;
    }

    public void setLookId(String lookId) {
        this.lookId = lookId == null ? null : lookId.trim();
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId == null ? null : lessonId.trim();
    }

    public Date getLookCreatetime() {
        return lookCreatetime;
    }

    public void setLookCreatetime(Date lookCreatetime) {
        this.lookCreatetime = lookCreatetime;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }
}