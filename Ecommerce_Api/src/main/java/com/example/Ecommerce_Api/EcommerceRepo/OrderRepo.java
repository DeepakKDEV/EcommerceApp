package com.example.Ecommerce_Api.EcommerceRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderRepo,Integer> {
}
