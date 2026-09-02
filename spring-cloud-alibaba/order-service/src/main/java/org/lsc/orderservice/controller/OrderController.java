package org.lsc.orderservice.controller;

import org.lsc.commonmodule.entity.Order;
import org.lsc.orderservice.feignClient.PointServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order")
@RefreshScope
public class OrderController {

    @Value("${config.info}")
    private String configInfo;

    @Autowired
    private PointServiceFeignClient pointServiceFeignClient;

    @GetMapping(value = "/test")
    public String test() {
        return "hello world";
    }

    @GetMapping(value = "/test/getNacosConfigInfo")
    public String getNacosConfigInfo() {
        return configInfo;
    }

    @PostMapping(value = "/getOrderInfo")
    public String getOrderInfo() {
        Order order = new Order();
        order.setId("123");
        order.setProductName("底料");
        String name = pointServiceFeignClient.getOrderId(order);
        return name;
    }

    @PostMapping(value = "/getOrderName")
    public String getOrderName() {
        String id = "1";
        String name = pointServiceFeignClient.getOrderName(id);
        return name;
    }
}
