package com.example.Ecommerce_Api.EcommerceController;

import com.example.Ecommerce_Api.EcommerceService.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;
}
