package cn.kobe.entity;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/1/20 21:03
 * @Describe
 */
public class Collection {
    private String collection_id;
    private String course_id;
    private Date colection_time;
    private String student_id;
    private Date collection_createtime;
    private boolean is_delete;
    private Date collection_deletetime;

    public String getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(String collection_id) {
        this.collection_id = collection_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public Date getColection_time() {
        return colection_time;
    }

    public void setColection_time(Date colection_time) {
        this.colection_time = colection_time;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public Date getCollection_createtime() {
        return collection_createtime;
    }

    public void setCollection_createtime(Date collection_createtime) {
        this.collection_createtime = collection_createtime;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Date getCollection_deletetime() {
        return collection_deletetime;
    }

    public void setCollection_deletetime(Date collection_deletetime) {
        this.collection_deletetime = collection_deletetime;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "collection_id='" + collection_id + '\'' +
                ", course_id='" + course_id + '\'' +
                ", colection_time=" + colection_time +
                ", student_id='" + student_id + '\'' +
                ", collection_createtime=" + collection_createtime +
                ", is_delete=" + is_delete +
                ", collection_deletetime=" + collection_deletetime +
                '}';
    }
}
