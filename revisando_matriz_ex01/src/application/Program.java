package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt();
		int negativeNumber =0;
		
		int mat[][] = new int[n][n];
		
		for (int i = 0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length;j++) {
				if (i == j) {
					System.out.printf(mat[i][j] + " ");
				}
				if (mat[i][j] < 0) {
					negativeNumber ++;
				}
			}
		}
		
		System.out.printf("\nNegative numbers: %d", negativeNumber);
		
		
		
		
		
		sc.close();

	}

}
