package com.kovanlabs.controller;

import com.kovanlabs.seeder.DepartmentSeeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeederController {
    @Autowired
    private DepartmentSeeder departmentSeeder;
    @GetMapping("/seed/departments")
    public String seedDepartments(){
        departmentSeeder.seed();
        return "departments inserted";
    }
}
