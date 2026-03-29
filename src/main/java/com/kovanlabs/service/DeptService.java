package com.kovanlabs.service;

import com.kovanlabs.entity.DeptEntity;
import com.kovanlabs.repository.DeptRepo;
import org.springframework.stereotype.Service;


@Service
public class DeptService {

    private final DeptRepo deptRepo;
    public DeptService(DeptRepo deptRepo) {
        this.deptRepo = deptRepo;
    }

    public String createDept(DeptEntity dept) {

        deptRepo.save(dept);

        return "success";
    }
}
