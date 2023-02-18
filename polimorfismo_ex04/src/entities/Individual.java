package entities;

public class Individual extends TaxPayer{

	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	
	
	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	

	public double getHealthExpenditures() {
		return healthExpenditures;
	}



	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}



	@Override
	public double tax() {
		
		if (super.getAnualIncome() < 20000.00) {
			if (healthExpenditures != 0) {
				return (super.getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
			}else {
			return (super.getAnualIncome() * 0.15);
			}
		}else {
			if (healthExpenditures != 0) {
			return (super.getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
			}
			else {
				return (super.getAnualIncome() * 0.25);
			}
		}
	}
	
	
	

}
