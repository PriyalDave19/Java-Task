import java.util.Scanner;
class Percentage{
	public static void main(String [] args){
	
	float sub1 ,sub2 , sub3 ,sub4 ,sub5,per;

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please Marks of Subjects : ");
	
	sub1 = sc.nextFloat();
	sub2 = sc.nextFloat();
	sub3 = sc.nextFloat();
	sub4 = sc.nextFloat();
	sub5 = sc.nextFloat();
	
	per = ((sub1 + sub2 + sub3 + sub4 + sub5)*100)/500; 
	
	System.out.println("Percentage = "+per);
	}
}