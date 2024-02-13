package com.LoanApp.com.codeworld.Service;



import com.LoanApp.com.codeworld.Domian.Shop;
import com.LoanApp.com.codeworld.Repositery.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    @Autowired
    private ShopRepository repository;
    public List<Shop> getAllShop()
    {
        List<Shop>shopList=repository.findAll();
        return shopList;
    }
//    public Shop getShopById(int id)
//    {
//        Shop shop=repository.findById(id).orElse(null);
//        return shop;
//    }
    public void addNewShop(Shop shop)
    {
        repository.save(shop);
    }
    public void updateShop(Shop shop)
    {
        repository.save(shop);
    }
//    public void deleteById(int id)
//    {
//        repository.deleteById(id);
//    }

//    public List<Shop> getByShopName(String name) {
//        return repository.getByShopName(name);
//    }
}
