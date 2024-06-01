package UsersJpa.com.example.UsersJPA.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class laptop {
@Id
	private int id;
	private String tag;
	private String model;
	private int serialno;
	
	@OneToOne(mappedBy = "laptop", cascade = CascadeType.ALL)
	private users user;
	
	public laptop(int id, String tag, String model, int serialno) {
		super();
		this.id = id;
		this.tag = tag;
		this.model = model;
		this.serialno = serialno;
	}
	
	public laptop() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the serialno
	 */
	public int getSerialno() {
		return serialno;
	}
	/**
	 * @param serialno the serialno to set
	 */
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
}
