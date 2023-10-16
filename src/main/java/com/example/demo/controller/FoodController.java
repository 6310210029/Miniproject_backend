package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Food;
import com.example.demo.repository.FoodRepository;

@RestController
@CrossOrigin(origins = "*")
public class FoodController {

	@Autowired
	FoodRepository foodReposity;
	
	
	@GetMapping("/food")
	public List<Food> getFood(){
		return foodReposity.findAll();
	}
	
	@PostMapping("/food")
	public Food addFood(@RequestBody Food body) {
		
		
		
		return foodReposity.save(body);
		
	}
	@GetMapping("/food/{foodId}")
	public Optional<Food> getFoodDetail(@PathVariable Integer foodId) {
		
		Optional<Food> food = foodReposity.findById(foodId);
		return food ;
	}
	
	@PutMapping("/food/{foodId}")
	public Food updateFood(@PathVariable Integer foodId, @RequestBody Food body) {
		
		Optional<Food> food = foodReposity.findById(foodId);
		
		if(food.isPresent()) {
			Food foodEdit = food.get();
			foodEdit.setmenu(body.getmenu());
			foodEdit.setcalories(body.getcalories());
			foodEdit.settype(body.gettype());
			foodEdit.setfoodId(body.getfoodId());
			
			foodReposity.save(foodEdit);

			return food.get();		
		}else {
			return null;
		}
		
	}
	
	@DeleteMapping("/food/{foodId}")
	public String deleteFood(@PathVariable Integer foodId) {
		Optional<Food> food = foodReposity.findById(foodId);
		
		if(food.isPresent()) {
			foodReposity.delete(food.get());
			
			return "DELETE SUCSESS";
		}else {
			return "Food not found";
		}
		
	}
}


	

