package com.bigmall.hermit.service;

import com.bigmall.hermit.common.api.CommonResult;
import com.bigmall.hermit.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     * @param orderParam
     * @return CommonResult
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     * @param orderId
     */
    @Transactional
    void cancelOrder(Long orderId);

}
