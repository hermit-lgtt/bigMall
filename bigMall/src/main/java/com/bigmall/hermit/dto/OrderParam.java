package com.bigmall.hermit.dto;

import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class OrderParam {
    //收获地址id
    private Long memberReceiveAddressID;
    //优惠卷id
    private Long couponID;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}
