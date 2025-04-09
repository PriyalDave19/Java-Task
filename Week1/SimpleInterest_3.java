import java.util.Scanner;
class SimpleInterest_3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int p;
		float r,t,si;
		System.out.println("Enter Principal , Rate , and Time :");
		p = sc.nextInt();
		r = sc.nextFloat();
		t = sc.nextFloat();
		
		si = p*r*t/100;
		
		System.out.println("Simple Interest = " +si);
	}

}