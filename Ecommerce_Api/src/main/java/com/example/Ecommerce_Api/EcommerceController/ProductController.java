package com.example.Ecommerce_Api.EcommerceController;

import com.example.Ecommerce_Api.EcommerceService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
}
