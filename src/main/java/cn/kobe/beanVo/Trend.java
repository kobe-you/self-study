package cn.kobe.beanVo;

import java.util.Date;

/**
 * @author: kobe byrant
 * @Date: 2020/3/1 19:00
 * @Describe
 */
public class Trend {
    private Date trendDate;
    private Integer counts;

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public Date getTrendDate() {
        return trendDate;
    }

    public void setTrendDate(Date trendDate) {
        this.trendDate = trendDate;
    }

    @Override
    public String toString() {
        return "Trend{" +
                "trendDate=" + trendDate +
                ", counts=" + counts +
                '}';
    }
}
