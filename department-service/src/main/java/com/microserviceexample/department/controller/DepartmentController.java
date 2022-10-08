package com.microserviceexample.department.controller;

import com.microserviceexample.department.entity.Department;
import com.microserviceexample.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside controller of save");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long depId) {
        log.info("inside controller of find");
        return departmentService.findByDepartmentId(depId).get();
    }
    @GetMapping("/all")
    public List<Department> findDepartments() {
    log.info("Getting all departments");
        return departmentService.getAllDepartments();
    }
}
