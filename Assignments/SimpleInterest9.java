import java.util.Scanner;
class SimpleInterest9{
	public static void main(String [] args){
	
		int p;
		float r, t , si;
		
		Scanner sc  = new Scanner (System.in);
		System.out.println("Please Enter Principle , Rate and Time For Calculate Simple Interest : ");
		p = sc.nextInt();
		r = sc.nextFloat();
		t = sc.nextFloat();
		
		si = (p*r*t)/100;
		
		System.out.println("Simple Interest = "+si);
	}
}