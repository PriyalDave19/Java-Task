import java.util.Scanner;
class Pyramid_1_3_5{
	public static void main(String [] args){
		
		int i ,j,k,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("N = ");
		n = sc.nextInt();
		
		for(i = 0 ; i < n ; i++){
			for(k = 0 ; k < n-i ; k++){
				System.out.print(" ");
			}
			for(j = 0 ; j <= i+i ; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

/*
	   *
	  ***
     *****
    *******
  

*/