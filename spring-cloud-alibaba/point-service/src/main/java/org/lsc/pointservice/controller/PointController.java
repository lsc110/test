package org.lsc.pointservice.controller;

import org.lsc.commonmodule.entity.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/point")
public class PointController {

    @GetMapping(value = "/test")
    public String test() {
        return "hello world";
    }

    @PostMapping(value = "/getOrderInfo")
    public String getOrderInfo(@RequestBody Order order) {
        return order.getProductName();
    }
    @PostMapping(value = "/getOrderName")
    public String getOrderName(@RequestParam String id) {
        Order order = new Order();
        order.setProductName("福建");
        return order.getProductName();
    }

}
