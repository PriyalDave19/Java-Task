import java.util.Scanner;
class Percentage8{
	public static void main(String [] args){
	
	float sub1 ,sub2 , sub3 ,sub4 ,sub5,per , total;

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter Marks of Subjects : ");
	
	sub1 = sc.nextFloat();
	sub2 = sc.nextFloat();
	sub3 = sc.nextFloat();
	sub4 = sc.nextFloat();
	sub5 = sc.nextFloat();
	
	total = (sub1 + sub2 + sub3 + sub4 + sub5);
	System.out.println("Total Marks = "+total);
	
	per = (total*100)/500; 
	System.out.println("Percentage = "+per);
	}
}