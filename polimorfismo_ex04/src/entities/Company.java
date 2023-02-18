package entities;

public class Company extends TaxPayer{

	private Integer numEmployee;
	
	public Company() {
		super();
	}
	
	
	public Company(String name, Double anualIncome, Integer numEmployee) {
		super(name, anualIncome);
		this.numEmployee = numEmployee;
	}


	public Integer getNumEmployee() {
		return numEmployee;
	}


	public void setNumEmployee(Integer numEmployee) {
		this.numEmployee = numEmployee;
	}


	@Override
	public double tax() {

		if (numEmployee > 10) {
			return super.getAnualIncome() * 0.14;
		} else {
			return super.getAnualIncome() * 0.1;
		}
		
	}
	
}
