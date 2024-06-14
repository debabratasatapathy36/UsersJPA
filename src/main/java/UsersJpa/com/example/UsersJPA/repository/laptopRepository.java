package UsersJpa.com.example.UsersJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import UsersJpa.com.example.UsersJPA.model.laptop;

@Repository
public interface laptopRepository extends JpaRepository<laptop, Integer> {
	


@Query(value = "Select * from users where serialno> :serialno ",nativeQuery = true)
	List<laptop> findBySerialNo(int serialno);

List<laptop> findByTag(String tag);

}
