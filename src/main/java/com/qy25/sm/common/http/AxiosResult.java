package com.qy25.sm.common.http;

import java.util.HashMap;

public class AxiosResult extends HashMap<String,Object> {
    private static final String STATUS="status";
    private static final String MESSAGE="message";
    private static final String DATA="data";

    public AxiosResult() {
    }
    public AxiosResult(AxiosStatus axiosStatus) {
        this.put(MESSAGE,axiosStatus.getMessage());
        this.put(STATUS,axiosStatus.getStatus());
    }
    //返回成功不携带数据
    public static AxiosResult success(){
        return new AxiosResult(AxiosStatus.success);
    }
    //返回成功携带数据
    public static AxiosResult success(Object obj){
        AxiosResult success = success();
        success.put(DATA,obj);
        return success;
    }
    //返回失败不携带数据
    public static AxiosResult error(){
        return new AxiosResult(AxiosStatus.error);
    }
    //返回失败携带数据
    public static AxiosResult error(Object obj){
        AxiosResult error = error();
        error.put(DATA,obj);
        return error;
    }
    //返回成功自定义状态码不携带数据
    public static AxiosResult success(AxiosStatus axiosStatus){
        return new AxiosResult(axiosStatus);
    }
    //返回成功自定义状态码携带数据
    public static AxiosResult success(Object obj,AxiosStatus axiosStatus){
        AxiosResult success = success(axiosStatus);
        success.put(DATA,obj);
        return success;
    }
    //返回失败自定义状态码不携带数据
    public static AxiosResult error(AxiosStatus axiosStatus){
        return new AxiosResult(axiosStatus);
    }
    //返回失败自定义状态码携带数据
    public static AxiosResult error(Object obj,AxiosStatus axiosStatus){
        AxiosResult error = error(axiosStatus) ;
        error.put(DATA,obj);
        return error;
    }
}
