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

    @PostMapping(value = "/getOrderId")
    public String getOrderId(@RequestBody Order order) {
        return order.getProductName();
    }
    @PostMapping(value = "/getOrderName")
    public String getOrderName(@RequestParam("productName") String productName) {
        Order order = new Order();
        order.setProductName("福建");
        System.out.println("9081");
        return order.getProductName();
    }

}
