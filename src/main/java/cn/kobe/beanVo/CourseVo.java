package cn.kobe.beanVo;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/2/21 12:05
 * @Describe
 */
public class CourseVo {
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

    private String tmpNum;

    private String types;

    private Integer sums;

    private Integer counts;

    public String getTmpNum() {
        return tmpNum;
    }

    public void setTmpNum(String tmpNum) {
        this.tmpNum = tmpNum;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePicture() {
        return coursePicture;
    }

    public void setCoursePicture(String coursePicture) {
        this.coursePicture = coursePicture;
    }

    public String getCourseDescribe() {
        return courseDescribe;
    }

    public void setCourseDescribe(String courseDescribe) {
        this.courseDescribe = courseDescribe;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseBaiduUrl() {
        return courseBaiduUrl;
    }

    public void setCourseBaiduUrl(String courseBaiduUrl) {
        this.courseBaiduUrl = courseBaiduUrl;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getCourseBasics() {
        return courseBasics;
    }

    public void setCourseBasics(String courseBasics) {
        this.courseBasics = courseBasics;
    }

    public String getCourseSoftware() {
        return courseSoftware;
    }

    public void setCourseSoftware(String courseSoftware) {
        this.courseSoftware = courseSoftware;
    }

    public String getCourseCate() {
        return courseCate;
    }

    public void setCourseCate(String courseCate) {
        this.courseCate = courseCate;
    }

    public Date getCourseCreatetime() {
        return courseCreatetime;
    }

    public void setCourseCreatetime(Date courseCreatetime) {
        this.courseCreatetime = courseCreatetime;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Date getCourseDeletetime() {
        return courseDeletetime;
    }

    public void setCourseDeletetime(Date courseDeletetime) {
        this.courseDeletetime = courseDeletetime;
    }

    public Integer getSums() {
        return sums;
    }

    public void setSums(Integer sums) {
        this.sums = sums;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        return "CourseVo{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", coursePicture='" + coursePicture + '\'' +
                ", courseDescribe='" + courseDescribe + '\'' +
                ", courseType='" + courseType + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", courseBaiduUrl='" + courseBaiduUrl + '\'' +
                ", courseLevel='" + courseLevel + '\'' +
                ", courseBasics='" + courseBasics + '\'' +
                ", courseSoftware='" + courseSoftware + '\'' +
                ", courseCate='" + courseCate + '\'' +
                ", courseCreatetime=" + courseCreatetime +
                ", isDelete=" + isDelete +
                ", courseDeletetime=" + courseDeletetime +
                ", sums=" + sums +
                ", counts=" + counts +
                '}';
    }
}
