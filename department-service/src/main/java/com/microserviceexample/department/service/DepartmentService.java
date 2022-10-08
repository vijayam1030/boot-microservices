package com.microserviceexample.department.service;

import com.microserviceexample.department.entity.Department;
import com.microserviceexample.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    public Optional<Department> findByDepartmentId(Long depId) {
       // return departmentRepository.findById(depId);
        return departmentRepository.findById(depId);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
