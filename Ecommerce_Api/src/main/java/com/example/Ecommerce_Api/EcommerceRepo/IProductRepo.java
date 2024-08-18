package com.example.Ecommerce_Api.EcommerceRepo;

import com.example.Ecommerce_Api.EcommerceModel.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends JpaRepository<ProductModel,Integer> {
}
