import java.util.Scanner;
class Reverse14{
	public static void main(String [] args){
		int rev = 0,rem, n ;
		
		System.out.println("Please Enter Any Number : ");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
	
		while(n != 0){
			rem = n%10;
			  n = n/10;
			rev = (rev*10)+rem;
		}
			System.out.println("Reverse = "+rev);
	}
}