package com.kovanlabs.controller;

import com.kovanlabs.entity.DeptEntity;
import com.kovanlabs.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/dept")
public class DeptController {
    private final DeptService deptService;
    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }

    @PostMapping("/deptcreate")
    public String deptCreate(@RequestBody DeptEntity dept) {
        return deptService.createDept(dept);
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
