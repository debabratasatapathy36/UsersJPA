package UsersJpa.com.example.UsersJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class trainingCourse {

	@Id
	private int id;
	private String name;
	private int code;
	public trainingCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public trainingCourse(int id, String name, int code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
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
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
}
