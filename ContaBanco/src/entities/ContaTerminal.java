package entities;

public class ContaTerminal {
	
	private Integer numero;
	private String agencia;
	private String nomeCliente;
	private Double saldo;
	
	public ContaTerminal() {
		
	}

	public ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public String toString() {
		return "Ola " + nomeCliente 
				+ ", obrigado por criar uma conta em nosso banco, sua agencia e "
				+ agencia 
				+ ", conta "
				+ numero 
				+ " e seu saldo "
				+ String.format("%.2f", saldo) + " ja esta disponivel para saque";
		
	}
	
	
	
	
	

}
