package com.example.Ecommerce_Api.EcommerceRepo;

import com.example.Ecommerce_Api.EcommerceModel.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<UserModel,Integer> {
}
