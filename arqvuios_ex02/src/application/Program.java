package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a folder path:");
		String strPath= sc.nextLine();
		
		
		File path = new File(strPath);
		
		
		// Imprimindo diretórios
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders :");
		
		for (File folder: folders) {
			System.out.println(folder);
		}
		
		//Imprimindo arquivos
		
		File[] files = path.listFiles(File::isFile);
		
		for(File file: files) {
			System.out.println(file);
		}
		
		
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		
		System.out.println("Directory created sucessfulyly : " + success);
		
		
		
		
		sc.close();
	}

}
