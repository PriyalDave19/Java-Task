import java.util.Scanner;
class LeapYear17{
	public static void main(String [] args){
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any year : ");
		year = sc.nextInt();
		
		if((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0) )
			System.out.print(year+"  is Leap Year ");
		else
			System.out.print(year+"  is not a Leap Year ");
	}

}