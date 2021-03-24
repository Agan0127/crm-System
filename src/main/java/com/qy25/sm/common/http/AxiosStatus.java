package com.qy25.sm.common.http;

public enum  AxiosStatus {
    success(20000,"返回成功"),
    error(40000,"返回失败")
    ;
    private int Status;
    private String Message;

    AxiosStatus() {
    }

    AxiosStatus(int status, String message) {
        Status = status;
        Message = message;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
