package entities;

public class Aluguel {
	private String name;
	private String email;
	private int room;
	
	public Aluguel (String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	/* Get set */
	public String getName() {
		return name;
		
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setRoom(int room) {
		this.room = room;
	}


	public int getRoom() {
		return room;
	}
	
	
	
public String toString () {
	return  room + ": " + name + ", " + email;
}
}
