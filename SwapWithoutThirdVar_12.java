import java.util.Scanner;
class SwapWithoutThirdVar_12{
	public static void main(String[] args){
		int a , b ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Before Swapping a = "+a+" b = "+b);
		
		a = a+b;   // a = 10+5 = 15
		b = a-b;   // b = 15-5 = 10
		a = a-b;  // b = 15-10 = 5
		
		System.out.println("After Swapping a = "+a+" b = "+b);
		
		System.out.println("\n\n Again Please enter 2 Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Before Swapping a = "+a+" b = "+b);
		
		a = a*b;   // a = 10+5 = 15
		b = a/b;   // b = 15-5 = 10
		a = a/b;  // b = 15-10 = 5
		
		System.out.println("After Swapping a = "+a+" b = "+b);
		
	}
}