package application;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		

		
		
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				
				mat[i][j] = sc.nextInt();
				
				
			}
		}
		
		int x =sc.nextInt();
		
		
		for(int i = 0; i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				
				if(mat[i][j] == x) {
					System.out.printf("Position " + i + "," + j "\n");
					System.out.printf("Left: %d", mat[i][j-1]);
					
					
				}
				
				
			}
			
			
		}
		
		
		
		
	
		sc.close();

	}
	


	}

}
