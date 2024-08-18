package com.example.Ecommerce_Api.EcommerceService;

import com.example.Ecommerce_Api.EcommerceRepo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;
}
