package com.bigmall.hermit.controller;

import com.bigmall.hermit.dto.OrderParam;
import com.bigmall.hermit.service.OmsPortalOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/order")
public class OmsPortalOrderController {
    @Resource
    private OmsPortalOrderService portalOrderService;;
    @PostMapping(value = "/generateOrder")
    @ResponseBody
    public Object generateOrder(@RequestBody OrderParam orderParam){
        return portalOrderService.generateOrder(orderParam);
    }


}
