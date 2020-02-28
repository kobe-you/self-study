package cn.kobe.beanVo;

import cn.kobe.bean.Student;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/2/27 22:20
 * @Describe
 */
public class CommentAndReply extends Student {
    private String courseId;
    private String type;
    private String studentC;
    private String content;
    private Date createDate;

    public String getStudentC() {
        return studentC;
    }

    public void setStudentC(String studentC) {
        this.studentC = studentC;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "CommentAndReply{" +
                "courseId='" + courseId + '\'' +
                ", type='" + type + '\'' +
                ", studentId='" + studentC + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
