package org.lsc.orderservice.feignClient;

import org.lsc.commonmodule.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "point-service")
public interface PointServiceFeignClient {

    @PostMapping(value = "/point/getOrderId")
    String getOrderId(@RequestBody Order order);

    @PostMapping(value = "/point/getOrderName")
    String getOrderName(@RequestParam String orderName);



}
