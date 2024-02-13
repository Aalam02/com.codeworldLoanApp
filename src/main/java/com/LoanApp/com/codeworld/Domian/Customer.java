package com.LoanApp.com.codeworld.Domian;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "mobile")
    private long mobileNo;

    @Column(name = "customer_address")
    private String customerAddress;

    @Column(name = "customer_id_proof")
    private String customerIdProof;

    @Column(name = "customer_id_number")
    private String CustomerIdNumber;

    @Column(name = "shop_id")
    private int shopId;

}
