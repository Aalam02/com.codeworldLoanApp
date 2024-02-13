package com.LoanApp.com.codeworld.Repositery;


import com.LoanApp.com.codeworld.Domian.GoldRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoldRateRepository extends JpaRepository<GoldRate,Integer> {
    @Query(value = "Select * from customer",nativeQuery = true)
    List<GoldRate> getAllGoldRate();


}
