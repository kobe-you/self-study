package cn.kobe.entity;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/1/19 11:45
 */
public class Carousel {
    private String carousel_id;
    private String carouse_color;
    private String carouse_url;
    private Date carouse_createtime;
    private boolean is_delete;
    private Date carouse_deletetime;

    public String getCarousel_id() {
        return carousel_id;
    }

    public void setCarousel_id(String carousel_id) {
        this.carousel_id = carousel_id;
    }

    public String getCarouse_color() {
        return carouse_color;
    }

    public void setCarouse_color(String carouse_color) {
        this.carouse_color = carouse_color;
    }

    public String getCarouse_url() {
        return carouse_url;
    }

    public void setCarouse_url(String carouse_url) {
        this.carouse_url = carouse_url;
    }

    public Date getCarouse_createtime() {
        return carouse_createtime;
    }

    public void setCarouse_createtime(Date carouse_createtime) {
        this.carouse_createtime = carouse_createtime;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Date getCarouse_deletetime() {
        return carouse_deletetime;
    }

    public void setCarouse_deletetime(Date carouse_deletetime) {
        this.carouse_deletetime = carouse_deletetime;
    }

    @Override
    public String toString() {
        return "Carousel{" +
                "carousel_id='" + carousel_id + '\'' +
                ", carouse_color='" + carouse_color + '\'' +
                ", carouse_url='" + carouse_url + '\'' +
                ", carouse_createtime=" + carouse_createtime +
                ", is_delete=" + is_delete +
                ", carouse_deletetime=" + carouse_deletetime +
                '}';
    }
}
