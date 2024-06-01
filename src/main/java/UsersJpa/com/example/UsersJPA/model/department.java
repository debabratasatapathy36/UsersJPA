package UsersJpa.com.example.UsersJPA.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class department {
@Id
private int id;
private String name;

@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
private List<users> user;

public department() {
	super();
	// TODO Auto-generated constructor stub
}
public department(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

}
