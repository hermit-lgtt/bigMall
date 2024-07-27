package com.bigmall.hermit.service.impl;

import com.bigmall.hermit.common.api.CommonResult;
import com.bigmall.hermit.component.CancelOrderSender;
import com.bigmall.hermit.dto.OrderParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OmsPortalOrderServiceImpl {
    private static Logger LOGGER = LoggerFactory.getLogger(OmsPortalOrderServiceImpl.class);
    @Autowired
    private CancelOrderSender cancelOrderSender;

/*    @Override
    public CommonResult generateOrder(OrderParam orderParam){

    }*/
}
