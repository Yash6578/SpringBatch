package com.learn.springbatch;

import com.learn.springbatch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Serializable> {
}
