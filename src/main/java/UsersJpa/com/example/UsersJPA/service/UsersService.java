package UsersJpa.com.example.UsersJPA.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UsersJpa.com.example.UsersJPA.model.users;
import UsersJpa.com.example.UsersJPA.repository.userRepository;

@Service
public class UsersService {
	@Autowired
	userRepository userrepository;
	
	
	private Logger logger = LoggerFactory.getLogger(UsersService.class);
	

	public users saveUser(users user) {
	users usersave=userrepository.save(user);
	 	return usersave;

}
public List<users> getAllUser() {
	// TODO Auto-generated method stub
	return userrepository.findAll();
}
public Optional<users> getUserbyid(int id) {
	// TODO Auto-generated method stub
	return userrepository.findById(id);
}
public List<users> findbyname(String name) {
	// TODO Auto-generated method stub
	return userrepository.findByName(name);
}
public List<users> findbysalary(int salary) {
	// TODO Auto-generated method stub
	return userrepository.findusersbysalary(salary);
}
public boolean  DeleteUser(int id) {
	Optional<users> usertobedeleted = userrepository.findById(id);
	if(usertobedeleted.isPresent()) {
	userrepository.deleteById(id);
	 return true;
	}
	else 
	return false; 
}
public users updateuser(int id, users user) {
	
	Optional<users> usertobeupdated = userrepository.findById(id);
	if(usertobeupdated.isPresent()) {
		
		users updateuser = usertobeupdated.get();
		
		updateuser.setAddress(user.getAddress());
		updateuser.setName(user.getName());
		updateuser.setAge(user.getAge());
		updateuser.setSalary(user.getSalary());
		
		userrepository.save(updateuser);
		 
	    return updateuser;
	    
	    
		}
	else
		return new users();
}

}
