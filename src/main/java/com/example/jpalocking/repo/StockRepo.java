package com.example.jpalocking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpalocking.entity.Stock;


public interface StockRepo extends JpaRepository<Stock, String>{

}
