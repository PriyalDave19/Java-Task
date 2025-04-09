import java.util.Scanner;
class Eligibility18{
	public static void main(String [] args){
		int age , ch;
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter 1 For Male \n0 For Female \nEnter Your Choice : ");
		ch = sc.nextInt();
		
		switch(ch){
			
			case 1 :
			System.out.println("Male :");
			System.out.println("Enter age of male: ");
		    age = sc.nextInt();
			if(age >= 21)
				System.out.println("You are Eligible for marriage");
			else
				System.out.println("First you grown-up");
			break;
			
			case 0 :
			System.out.println("Enter age of female: ");
		    age = sc.nextInt();
			if(age >= 18)
				System.out.println("You are Eligible for marriage");
			else
				System.out.println("First you grown-up");
			break;
			
			default:
			System.out.println("Enter Valid Choice");
			
		}
	}
}