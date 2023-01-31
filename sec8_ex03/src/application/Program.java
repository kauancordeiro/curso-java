package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();

		System.out.println("Informe o nome do Aluno:");
		stu.name = sc.nextLine();

		System.out.println("Informe as 3 notas: ");
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();

		System.out.printf("Nota final : %.2f", stu.notaFinal());
		if (stu.notaFinal() > 60) {
			System.out.println("\nPassou!");
		} else {

			System.out.println("\nReprovou!");
			System.out.printf("Faltou %.2f Pontos", stu.notaFalta());
		}

		sc.close();

	}

}
