package com.example.backend.repo;

import com.example.backend.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {
}
