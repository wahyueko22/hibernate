package com.example.jpalocking.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpalocking.entity.Stock;
import com.example.jpalocking.repo.StockRepo;

@RestController
public class StockController {
	
	@Autowired
	private StockRepo stockRepo;
	
	@GetMapping("/version/update")
	public ResponseEntity<?> getUpdate(
			@RequestParam("id") String id,
			@RequestParam("stock") Integer stock,
			@RequestParam("version") Integer version
			) {
		
		Stock st = stockRepo.getOne("1");
		 st = stockRepo.getOne("1");
		 st = stockRepo.getOne("1");
		Random random = new Random();
        // generate random number from 0 to 3
        int number = random.nextInt(Integer.MAX_VALUE);
		st.setStock(number);
		
		stockRepo.save(st);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
