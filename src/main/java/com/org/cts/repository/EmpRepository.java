package com.org.cts.repository;

import com.org.cts.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRepository extends MongoRepository<Employee,Integer> {
}
