package com.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.api.entity.UserAddress;
import com.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam(name="id") String id){
        return orderService.initOrder(id);
    }

}
