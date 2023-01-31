package entities;

public class Usuarios {
	private double height;
	private char gen;

	public Usuarios(double height, char gen) {
		this.height = height;
		this.gen = gen;
	}
	
	

	


	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	public char getGen() {
		return gen;
	}

}
