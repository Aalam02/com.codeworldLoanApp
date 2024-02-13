package com.LoanApp.com.codeworld.Service;


import com.LoanApp.com.codeworld.Domian.Staff;
import com.LoanApp.com.codeworld.Repositery.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffService {
    @Autowired
    private StaffRepository repository;
    public List<Staff> getAllStaff() {
        List<Staff>staffList=repository.findAll();
        return staffList;
    }

    public void updateStaff(Staff staff) {
        repository.save(staff);
    }

    public void addNewStaff(Staff staff) {
        repository.save(staff);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
