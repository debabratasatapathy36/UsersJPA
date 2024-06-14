package UsersJpa.com.example.UsersJPA.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import UsersJpa.com.example.UsersJPA.model.users;

@Repository
public interface userRepository extends JpaRepository<users, Integer> {

	List<users> findByName(String name);
    @Query(value = "Select * from users where salary> :salary ",nativeQuery = true)
	List<users> findusersbysalary(int salary);

	

	

}
