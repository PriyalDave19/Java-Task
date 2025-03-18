import java.util.Scanner;
class GreatestInto3_16{
	public static void main(String [] args){}{

	int a,b,c;
	
	System.out.println("Enter Three Numbers : ");
	
	Scanner sc = new Scanner(System.in);
	
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();

	if(a == b)
		System.out.println("a is equal to b");
	if(a == c)
		System.out.println("a is equal to c");
	if(b == c)
		System.out.println("b is equal to c");
	
	
	if(a>b && a>c)
		System.out.println("a is greater");
	else if(b>c)
		System.out.println("b is grater");
	else
		System.out.println("c is grater");
	}
}