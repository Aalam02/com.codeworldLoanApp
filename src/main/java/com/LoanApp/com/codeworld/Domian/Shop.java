package com.LoanApp.com.codeworld.Domian;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private  int shopId;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "mobile")
    private long mobileNo;

    @Column(name = "shop_address")
    private String shopAddress;

    @Column(name = "city")
    private String City;

    @Column(name = "password")
    private String Password;



}
