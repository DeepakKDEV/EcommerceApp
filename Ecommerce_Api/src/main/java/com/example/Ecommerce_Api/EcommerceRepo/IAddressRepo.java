package com.example.Ecommerce_Api.EcommerceRepo;

import com.example.Ecommerce_Api.EcommerceModel.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo  extends JpaRepository<AddressModel, Integer> {
}
