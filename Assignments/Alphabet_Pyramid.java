import java.util.Scanner;
class Alphabet_Pyramid{
	public static void main(String [] args){
		int i , j , k , n;
		char p = 'A';
		
		System.out.println("N = ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i = 0 ;i < n ; i++){
			for(k = 0 ; k < n-i ; k++){
				System.out.print(" ");
			}
			for(j = 0 ; j <= i+i ; j++){
					System.out.print(p);
					p++;
			}
			System.out.print("\n");
			
		}
	}
}



/*
		A
	   BCD
      EFGHI
     JKLMNOP
*/