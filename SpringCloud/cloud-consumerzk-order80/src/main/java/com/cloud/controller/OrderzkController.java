package com.cloud.controller;

import com.cloud.entities.CommonResult;
import com.cloud.entities.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
public class OrderzkController {
    public static final String PAYMENT_URL = "http://CGQ-CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/zk")
    public String info(){
        String forObject = restTemplate.getForObject(PAYMENT_URL + "/zk", String.class);
        return forObject;
    }

}
