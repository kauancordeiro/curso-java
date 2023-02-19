package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		
		for (int i = 1; i<=n; i++) {
			
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				TaxPayer taxPayer = new Individual(name, anualIncome, healthExpenditures);
				
				taxPayers.add(taxPayer);
			}
			else {
				System.out.print("Number of employees: ");
				int numEmployee = sc.nextInt();
				
				
				TaxPayer taxPayer = new Company(name,anualIncome, numEmployee);
				taxPayers.add(taxPayer);
				
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double total = 0.0;
		for (TaxPayer tp : taxPayers) {
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
			total += tp.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", total);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
