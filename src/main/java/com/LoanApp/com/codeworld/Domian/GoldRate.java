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
@Table(name = "goldrate")
public class GoldRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gold_id")
    private int goldId;

    @Column(name = "date")
    private String Date;

    @Column(name = "time")
    private String Time;

    @Column(name = "price")
    private double Price;

    @Column(name = "shop_id")
    private int shopId;

}
