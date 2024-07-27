package com.bigmall.hermit.dto;

import lombok.Getter;

/**
 * @description 消息队列枚举配置
 * @date 2024/7/26
 *
 */
@Getter
public enum QueueEnum {
    /**
     *消息通知队列
     */
    QUEUE_ORDER_CANCEL("mall.order.direct", "mall.order.cancel", "mall.order.cancel"),
    /**
     * 消息通知ttl队列
     */
    QUEUE_TTL_ORDER_CANCEL("mall.order.direct.ttl", "mall.order.cancel.ttl", "mall.order.cancel.ttl");
    /**
     * 交换机
     */
    private String exchange;
    /**
     * 队列名称
     */
    private String name;
    /**
     * 路由键
     */
    private String routeKey;

    /**
     * @date 2024/7/26
     * @param exchange
     * @param name
     * @param routeKey
     */
    QueueEnum(String exchange,String name,String routeKey){
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
