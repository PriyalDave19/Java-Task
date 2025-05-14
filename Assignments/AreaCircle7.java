import java.util.Scanner;
class AreaCircle7{
	public static void main(String [] args){
		float area , rad , circum ;
	    float pie = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Radius of Circle : ");
		rad = sc.nextFloat();
		area = pie * rad * rad; 
		System.out.println("Area of Circle = "+area);

		circum = 2 * pie * rad;
		System.out.println("Circumference of Circle = "+circum);

				
	}

}