package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private String name;
	private String email;
	private Date birthDate;
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("hh/MM/yyyy");
	
	public Client() {
		
	}


	public Client(String name, String email, Date birthDate) {
		
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	public String toString() {
		return "Client: " + name + " (" + sdf.format(birthDate) + ") - " + email + "\n";
	}
	
	
	
	

}
