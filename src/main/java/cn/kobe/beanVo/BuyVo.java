package cn.kobe.beanVo;

import cn.kobe.bean.Course;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/2/28 20:05
 * @Describe
 */
public class BuyVo extends Course {
    private String buyId;

    private String studentId;

    private Date buyCreatetime;

    private Double buyMoney;

    public String getBuyId() {
        return buyId;
    }

    public void setBuyId(String buyId) {
        this.buyId = buyId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getBuyCreatetime() {
        return buyCreatetime;
    }

    public void setBuyCreatetime(Date buyCreatetime) {
        this.buyCreatetime = buyCreatetime;
    }

    public Double getBuyMoney() {
        return buyMoney;
    }

    public void setBuyMoney(Double buyMoney) {
        this.buyMoney = buyMoney;
    }
}
