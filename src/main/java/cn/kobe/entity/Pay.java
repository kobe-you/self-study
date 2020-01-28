package cn.kobe.entity;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/1/20 8:56
 * @Describe
 */
public class Pay {
    private String pay_id;
    private String student_id;
    private float pay_money;
    private Date pay_time;

    public String getPay_id() {
        return pay_id;
    }

    public void setPay_id(String pay_id) {
        this.pay_id = pay_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public float getPay_money() {
        return pay_money;
    }

    public void setPay_money(float pay_money) {
        this.pay_money = pay_money;
    }

    public Date getPay_time() {
        return pay_time;
    }

    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "pay_id='" + pay_id + '\'' +
                ", student_id='" + student_id + '\'' +
                ", pay_money=" + pay_money +
                ", pay_time=" + pay_time +
                '}';
    }
}
