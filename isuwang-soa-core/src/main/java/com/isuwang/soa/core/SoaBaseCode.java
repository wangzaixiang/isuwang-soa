package com.isuwang.soa.core;

/**
 * @author craneding
 * @date 15/9/10
 */
public enum SoaBaseCode {

    UnKnown("Err-Core-000", "系统出错了!"),
    NotNull("Err-Core-001", "字段不允许为空"),
    NotFoundServer("Err-Core-098", "无可用的服务实例"),
    NotConnected("Error-Core-002", "连接失败"),
    TimeOut("Error-Core-003", "请求超时");

    private String code;
    private String msg;

    private SoaBaseCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
