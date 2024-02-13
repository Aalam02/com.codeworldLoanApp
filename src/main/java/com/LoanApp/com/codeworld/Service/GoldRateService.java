package com.LoanApp.com.codeworld.Service;


import com.LoanApp.com.codeworld.Domian.GoldRate;
import com.LoanApp.com.codeworld.Repositery.GoldRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoldRateService {
    @Autowired
    private GoldRateRepository repository;
    public List<GoldRate> getAllGoldRate() {
        List<GoldRate>goldRateList=repository.findAll();
        return goldRateList;
    }

    public void updateGoldRate(GoldRate goldRate) {
        repository.save(goldRate);
    }

    public void addNewGoldRate(GoldRate goldRate) {
        repository.save(goldRate);
    }


    public void deleteId(int id) {
        repository.deleteById(id);
    }
}
