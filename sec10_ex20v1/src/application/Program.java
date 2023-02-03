package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Client;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		
		Client cli = new Client("Kauan", "cvitorcordeiro@gmail.com", sdf.parse("10/11/1998"));
		
		System.out.println(cli);

	}

}
