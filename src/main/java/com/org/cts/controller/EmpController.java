package com.org.cts.controller;

import com.org.cts.model.Employee;
import com.org.cts.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp/")
public class EmpController {

    @Autowired
    private EmpRepository empRepository;

    @PostMapping("/create")
    public void createEmpRecord(@RequestBody Employee employee) {
        empRepository.save(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmp(){
      return   empRepository.findAll();
    }
}
