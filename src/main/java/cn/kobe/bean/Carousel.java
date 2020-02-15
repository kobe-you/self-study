package cn.kobe.bean;

import java.util.Date;

public class Carousel {
    private String carouselId;

    private String carouseColor;

    private String carouseUrl;

    private Date carouseCreatetime;

    private Boolean isDelete;

    private Date carouseDeletetime;

    public String getCarouselId() {
        return carouselId;
    }

    public void setCarouselId(String carouselId) {
        this.carouselId = carouselId == null ? null : carouselId.trim();
    }

    public String getCarouseColor() {
        return carouseColor;
    }

    public void setCarouseColor(String carouseColor) {
        this.carouseColor = carouseColor == null ? null : carouseColor.trim();
    }

    public String getCarouseUrl() {
        return carouseUrl;
    }

    public void setCarouseUrl(String carouseUrl) {
        this.carouseUrl = carouseUrl == null ? null : carouseUrl.trim();
    }

    public Date getCarouseCreatetime() {
        return carouseCreatetime;
    }

    public void setCarouseCreatetime(Date carouseCreatetime) {
        this.carouseCreatetime = carouseCreatetime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCarouseDeletetime() {
        return carouseDeletetime;
    }

    public void setCarouseDeletetime(Date carouseDeletetime) {
        this.carouseDeletetime = carouseDeletetime;
    }
}