import java.util.Scanner;
class Reverse1{

	public static void main(String [] args){
		
		int n ,rem,rev=0;
		System.out.println("Enter Number = ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while(n != 0){
			rem = n%10;
			n = n/10;
			rev = rev*10 + rem;
		}
		System.out.println("Rev = " +rev);
	}
}