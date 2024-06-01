package UsersJpa.com.example.UsersJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ticket {

	@Id
	private int id;
	private int ticketNumber;
	private String priority;
	private String status;
	@ManyToOne
	private users user;
	public ticket(int id, int ticketNumber, String priority, String status) {
		super();
		this.id = id;
		this.ticketNumber = ticketNumber;
		this.priority = priority;
		this.status = status;
		
	}
	public ticket() {
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
	 * @return the ticketNumber
	 */
	public int getTicketNumber() {
		return ticketNumber;
	}
	/**
	 * @param ticketNumber the ticketNumber to set
	 */
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
}
