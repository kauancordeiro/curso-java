package entities;

public class Pessoas {
	
	private String nome;
	private double notaA;
	private double notaB;
	
	public Pessoas() {
		
	}

	public Pessoas(String nome, double notaA, double notaB) {
		
		this.nome = nome;
		this.notaA = notaA;
		this.notaB = notaB;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaA() {
		return notaA;
	}

	public void setNotaA(double notaA) {
		this.notaA = notaA;
	}

	public double getNotaB() {
		return notaB;
	}

	public void setNotaB(double notaB) {
		this.notaB = notaB;
	}
	
	
	public double media () {
		return (notaA + notaB) / 2;
	}
	
	

}
