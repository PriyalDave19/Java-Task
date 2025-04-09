import java.util.Scanner;
class Sum_Marks2{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of 3 Subjects :");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		
		int per = (s1+s2+s3)/3;
		System.out.println("Percentage = "+per);
	}
}