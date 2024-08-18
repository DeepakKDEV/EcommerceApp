package com.example.Ecommerce_Api.EcommerceController;

import com.example.Ecommerce_Api.EcommerceService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;
}
