import java.util.Scanner;
class MatrixMultiplication{
	public static void main(String [] args){
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int i , j ,k, sum = 0;
		
		Scanner sc = new Scanner(System.in);		
		
		for(i = 0 ; i < 3 ; i++){
			for(j = 0 ; j < 3 ; j++){
			System.out.print("Enter Value in a: \t");
			a[i][j] = sc.nextInt();
		}
			System.out.println("");
		}
		
		for(i = 0 ; i < 3 ; i++){
			for(j = 0 ; j < 3 ; j++){
			System.out.print("Enter Value in b: \t");
			b[i][j] = sc.nextInt();
		}
			System.out.println("");
		}
		
		System.out.print("\nMatrix Multiplication : \n");
		for(i = 0 ; i < 3 ; i++){
			for(j = 0 ; j < 3 ; j++){
				for(k = 0 ; k < 3 ; k++){
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
				sum = 0;
			}
		}
		
		
		for(i = 0 ; i < 3 ; i++){
			for(j = 0 ; j < 3 ; j++){
				System.out.print(" "+c[i][j]);
			}
			System.out.println("");
		}
    
	
	
	}

}