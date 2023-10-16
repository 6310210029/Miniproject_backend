package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="food")

public class Food {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer foodId;
	private String menu;
	private Integer calories;
	private String  type;
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Food() {
		super();
	}

	public Food(Integer foodId, String menu, Integer calories , String type ) {
		super();
		this.foodId = foodId;
		this.menu =  menu;
		this.calories = calories;
		this.type = type;
	}
	
	public Integer getfoodId() {
		return foodId;
	}
	public void setfoodId(Integer foodId) {
		this.foodId = foodId;
	}
	public String getmenu() {
		return menu;
	}
	public void setmenu(String menu) {
		this.menu = menu;
	}
	public Integer getcalories() {
		return  calories;
	}
	public void setcalories(Integer  calories) {
		this.calories =  calories;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	
	
}