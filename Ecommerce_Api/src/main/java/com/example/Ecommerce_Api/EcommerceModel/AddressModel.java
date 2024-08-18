package com.example.Ecommerce_Api.EcommerceModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AddressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String landmark;
    private Long phoneNumber;
    private Integer zipcode;
    private String state;
    private int userID;
    @OneToOne
    @JoinColumn(name="f_k_UserID")
    UserModel  userId;
}
