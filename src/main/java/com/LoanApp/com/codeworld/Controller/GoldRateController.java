package com.LoanApp.com.codeworld.Controller;



import com.LoanApp.com.codeworld.Domian.GoldRate;
import com.LoanApp.com.codeworld.Service.GoldRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoldRateController {
    @Autowired
    private GoldRateService service;
    @GetMapping("/goldRate")
    public List<GoldRate> getallGoldRate()
    {
        return service.getAllGoldRate();
    }
    @PutMapping("/goldRateUpdate")
    public void updateGoldRate(@RequestBody GoldRate  goldRate)
    {
        service.updateGoldRate(goldRate);
    }
    @PostMapping("/goldRate")
    public void addNewGoldRate(@RequestBody GoldRate  goldRate)
    {
        service.addNewGoldRate(goldRate);
    }
    @DeleteMapping("/goldRate/{id}")
    public void deleteId(@PathVariable(value = "id")int id)
    {
        service.deleteId(id);
    }
}
