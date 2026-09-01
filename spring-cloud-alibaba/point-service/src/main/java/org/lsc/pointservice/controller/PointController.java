package org.lsc.pointservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/point")
public class PointController {

    @GetMapping(value = "/test")
    public String test(){
        return "hello world";
    }
}
