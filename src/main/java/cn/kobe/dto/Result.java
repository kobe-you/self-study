package cn.kobe.dto;

import org.springframework.http.HttpStatus;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 17:40
 * @Describe
 */
public class Result<T> {
    private String code;
    private String message;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
