package com.frankstyle;

public class ResponseData<T> {
    T data;
    String code;
    String message;

    public ResponseData(T data, String code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public ResponseData(String code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public ResponseData() {
    }

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
}
