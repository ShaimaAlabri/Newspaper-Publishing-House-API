package com.example.Newspaper.Publishing.House.API.Repository;

import com.example.Newspaper.Publishing.House.API.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, List> {
}
