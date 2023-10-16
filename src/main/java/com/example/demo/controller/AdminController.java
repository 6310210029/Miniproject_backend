//package com.example.demo.controller;
//
//
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.Admin;
//import com.example.demo.repository.AdminRepository;
//
//@RestController
//@CrossOrigin(origins = "*")
//public class AdminController {
//
//	@Autowired
//	AdminRepository adminReposity;
//	
//	
//	@GetMapping("/admin")
//	public List<Admin> getAdmin(){
//		return  adminReposity.findAll();
//	}
//	
//	@PostMapping("/admin")
//	public Admin addAdmin(@RequestBody Admin body) {
//		
//		
//		
//		return  adminReposity.save(body);
//		
//	}
//	@GetMapping("/admin/{ adminId}")
//	public Optional<Admin> getAdminDetail(@PathVariable Integer  adminId) {
//		
//		Optional<Admin>  admin =  adminReposity.findById( adminId);
//		return  admin ;
//	}
//	
//	@PutMapping("/admin/{ adminId}")
//	public Admin updateAdmin(@PathVariable Integer adminId, @RequestBody Admin body) {
//		
//		Optional<Admin>admin =  adminReposity.findById(adminId);
//		
//		if(admin.isPresent()) {
//			Admin adminEdit =  admin.get();
//			adminEdit.setusername(body.getusername());
//			adminEdit.setpassword(body.getpassword());
//			adminEdit.setadminId(body.getadminId());
//			
//			 adminReposity.save(adminEdit);
//
//			return admin.get();		
//		}else {
//			return null;
//		}
//		
//	}
//	
//	@DeleteMapping("/admin/{adminId}")
//	public String deletAdmin(@PathVariable Integer adminId) {
//		Optional<Admin>  admin = adminReposity.findById(adminId);
//		
//		if(admin.isPresent()) 
//			 adminReposity.delete(admin.get());
//			
//			return "DELETE SUCSESS";
//		}else {
//			return "Admin not found";
//		}
//		
//	}
//}
//
//
//	
//
