package UsersJpa.com.example.UsersJPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import UsersJpa.com.example.UsersJPA.model.users;
import UsersJpa.com.example.UsersJPA.repository.userRepository;
import UsersJpa.com.example.UsersJPA.service.UsersService;

@RestController
public class usersController {

	@Autowired
	UsersService userservice;
	
	@Autowired
	userRepository userrepository;
	
	
	@PostMapping("/Createuser")
	public users CreateUser(@RequestBody users user){
		users user1=userservice.saveUser(user);
		return user1;
	}
	
	@GetMapping("/Getuser")
	public List<users> getUser(){
		List<users> getuser=userservice.getAllUser();
		return getuser;
	}
	
	@GetMapping("/GetuserById/{id}")
	public Optional<users> getUserById(@PathVariable int id){
		Optional<users> user =userservice.getUserbyid(id);
		return user;
	}
	
	@GetMapping("/GetuserByName")
	public List<users> getUserByName(@RequestParam(value = "name", required = false) String name)
	{
		
		List<users> findaNme=userservice.findbyname(name);
			return findaNme;
		
		
	}
	
	@GetMapping("/GetuserBySalary")
	public List<users> getUserBySalary(@RequestParam(value = "salary", required = false) int salary)
	{
		
		List<users> findasalary=userservice.findbysalary(salary);
			return findasalary;
		
		
	}
	@DeleteMapping("/DeleteUser/{id}")
	public String Deleteuser(@PathVariable int id) {
	
	 boolean delete = userservice.DeleteUser(id);
	 if(delete) {
		 return "user deleted sucessfully";
	
	}
	else
		return "user not found";
	}
	
	@PutMapping("/updateuser/{id}")
	public  String updateuser(@PathVariable int id,@RequestBody users user) {
		
		users userupdated = userservice.updateuser(id,user);
		
		if(userupdated.getName()!= null)
		return "user updated sucessfully";
		else {
			return "user not found";
		}
			
	}
	
}
