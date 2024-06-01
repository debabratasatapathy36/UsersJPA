package UsersJpa.com.example.UsersJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UsersJpa.com.example.UsersJPA.model.laptop;
import UsersJpa.com.example.UsersJPA.repository.laptopRepository;

@Service
public class laptopService {

	@Autowired
	 laptopRepository laptoprepository;
	
	public laptop savelaptop(laptop laptop) {
		laptop laptopsave=laptoprepository.save(laptop);
		return laptopsave ;
	}

	public List<laptop> getlaptop() {
		
		return laptoprepository.findAll();
	}
	
	public Optional<laptop> getlaptopbyid(int id) {
		// TODO Auto-generated method stub
		return laptoprepository.findById(id);
	}
	
	public List<laptop> getTagId(String tag) {
		// TODO Auto-generated method stub
		return laptoprepository.findByTag(tag);
	}
	
	public List<laptop> getSerialNo(int serialno) {
		// TODO Auto-generated method stub
		return laptoprepository.findBySerialNo(serialno);
	}

	public boolean deleteLaptop(int id) {
	Optional<laptop> laptodId=laptoprepository.findById(id);
	if(laptodId.isPresent()) {
		laptoprepository.deleteById(id);
		 return true;
		}
		else 
		return false; 
	}

	public laptop updateLaptop(int id, laptop laptop) {
		Optional<laptop> laptodId=laptoprepository.findById(id);
		if(laptodId.isPresent()) {
			laptop laptoptobeupdated=laptodId.get();
			laptoptobeupdated.getModel();
			laptoptobeupdated.getSerialno();
			laptoptobeupdated.getTag();
			
			return laptoprepository.save(laptoptobeupdated);
		}
		else
		return new laptop();
	}

}
