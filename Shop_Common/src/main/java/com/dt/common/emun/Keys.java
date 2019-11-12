package com.dt.common.emun;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/8 0008
 * @since v1.0
 */
//@SuppressWarnings("all")
public enum Keys {

    APPOINTMENT("Appointment:"),

    EVALUATE("evaluate:"),

    ORDER("order:"),

    UNDEFINE("未定义异常信息");
    private String msg;

    private Keys(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }


}
