package com.LoanApp.com.codeworld.Controller;


import com.LoanApp.com.codeworld.Domian.Shop;
import com.LoanApp.com.codeworld.Service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {
    @Autowired
    private ShopService service;
@GetMapping("/shop")
    public List<Shop>getallShop()
    {
        return service.getAllShop();
    }
//    @GetMapping("/Shop/{id}")
//    public Shop getShopById(@PathVariable(value = "id") int id )
//    {
//        return service.getShopById(id);
//    }
    @PostMapping("/shop")
    public void addNewShop(@RequestBody Shop shop)
    {
        service.addNewShop(shop);
    }
    @PutMapping("/shopUpdate")
    public void updateShop(@RequestBody Shop shop)
    {
        service.updateShop(shop);
    }
//    @DeleteMapping("/Shop/{id}")
//    public void deleteById(@PathVariable (value = "id") int id)
//    {
//        service.deleteById(id);
//    }
//    @GetMapping("/getByShopName/{name}")
//    public List<Shop>getByShopName(@PathVariable(value = "name")String name)
//    {
//        return service.getByShopName(name);
//    }



}
