package com.LoanApp.com.codeworld.Repositery;



import com.LoanApp.com.codeworld.Domian.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShopRepository extends JpaRepository <Shop,Integer> {
//    List<Shop> getByShopName(String name);

    @Query(value = "select * from shop", nativeQuery = true)
    List<Shop> getAllStudent();

//    @Transactional
//    @Modifying
//    @Query("delete from Shop shop where shop.")
}
