package com.example.Ecommerce_Api.EcommerceModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @OneToOne
    @JoinColumn(name = "fk_UserId")
    UserModel userId;

    @OneToOne
    @JoinColumn(name = "fk_Product_Id")
    ProductModel productId;

    @OneToOne
    @JoinColumn(name = "fk_Address_Id")
    AddressModel addressId;

    private  Integer quantity;
}
