package com.lt.msg.service;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/18 0018
 * @since v1.0
 */
public interface SendMsgByQueue {
    void send(String reserverWashCarQueue, String msg);
}
