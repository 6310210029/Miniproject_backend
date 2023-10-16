//package com.example.demo.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="admin")
//
//public class Admin {
//	
//    @Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//	private Integer adminId;
//	private String username;
//	private Integer password;
//	
//	
//	
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public Admin() {
//		super();
//	}
//
//	public Admin(Integer adminId, String username, Integer password  ) {
//		super();
//		this.adminId = adminId;
//		this.username = username;
//		this.password  = password ;
//
//	}
//	
//	public Integer getadminId() {
//		return adminId;
//	}
//	public void setadminId(Integer adminId) {
//		this.adminId = adminId;
//	}
//	public String getusername() {
//		return username;
//	}
//	public void setusername(String username) {
//		this.username = username;
//	}
//	public Integer getpassword() {
//		return   password;
//	}
//	public void setpassword(Integer password) {
//		this.password =   password;
//	}
//
//
//	
//	
//}