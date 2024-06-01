package UsersJpa.com.example.UsersJPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import UsersJpa.com.example.UsersJPA.model.laptop;
import UsersJpa.com.example.UsersJPA.repository.laptopRepository;
import UsersJpa.com.example.UsersJPA.service.laptopService;

@RestController
public class laptopController {

	@Autowired
	private laptopService laptopservice;
	
	@Autowired
	private laptopRepository laptoprepository;
	
	@PostMapping("/Savelaptop")
	public laptop saveLaptop(@RequestBody laptop laptop) {
		laptop laptop1=laptopservice.savelaptop(laptop);
		return laptop1;
	}
	
	@GetMapping("/getlaptop")
	public List<laptop> getLaptop() {
		List<laptop> laptop1=laptopservice.getlaptop();
		return laptop1;
	}
	
	@GetMapping("/getlaptopbyid/{id}")
	public Optional<laptop> getLaptopbyID(@PathVariable int id) {
		Optional<laptop> laptop1=laptopservice.getlaptopbyid(id);
		return laptop1;
	}
	
	@GetMapping("/getTag")
	public List<laptop> getTagID(@RequestParam(value="tag",required=false) String tag) {
		List<laptop> laptop1=laptopservice.getTagId(tag);
		return laptop1;
	}
	
	
	@GetMapping("/getSerialNo")
	public List<laptop> getSerialNo(@RequestParam(value="serialno",required=false) int serialno) {
		List<laptop> laptop1=laptopservice.getSerialNo(serialno);
		return laptop1;
	}
	@DeleteMapping("Deletelaptop/{id}")
	public String deleteLaptop(@PathVariable int id) {
		boolean delete=laptopservice.deleteLaptop(id);
		if(delete) {
			return "Laptop value deleted successfully";
		}
			
			else
				return "No laptop found";
			
		}
	@PutMapping("UpdateLaptod/{id}")
	public String updateLaptop(@PathVariable int id ,@RequestBody laptop laptop) {
		laptop laptoptobeupdated=laptopservice.updateLaptop(id,laptop);
		if(laptoptobeupdated.getTag()!=null) {
			return "User has been updated";
		}
		else
			return "No User found";
	}
	
	}

	

