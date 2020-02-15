package cn.kobe.dto;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.List;

/**
 * 功能描述：
 *
 * @Auther: kobe
 * @Date: 2018/7/19 09:49
 */
public class PageResult<T> implements Serializable {

    private Integer pageNumber;

    private Integer pageSize;

    private Integer total;

    private String code;

    private String message;

    private List<T> data;

    public PageResult() {
    }

    public PageResult(Integer pageNumber, Integer pageSize, Integer total, String code, String message, List<T> data) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.total = total;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
