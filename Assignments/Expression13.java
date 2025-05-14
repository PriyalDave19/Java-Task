import java.util.Scanner;
class Expression13{
	public static void main(String [] args){
		int x , y ,z;
		
		Scanner sc = new Scanner(System.in);	

		System.out.print("Enter Value of x: \n");		
		x = sc.nextInt();
		System.out.println("Value of x:  "+x);	
		
		z = x*x + 3*x -7;
		System.out.println("Value of z in Expression1 :  z = "+z);	
		
		y = (x++) + (++x) ;
		System.out.println("Value of x and y in Expression2 : x =  "+x+"\t y = "+y);
		
		
		System.out.print("Enter Value of x and y : \n");		
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Value of x:  "+x+"\t y = "+y);
		
		z = (x++) - (--y) - (--x) + (x++);
		System.out.println("Value of x , y and z in Expression3 : x =  "+x+"\t y = "+y+"\t z = "+z);
		
		
		System.out.print("Enter Value of x and y : \n");		
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Value of x:  "+x+"\t y = "+y);
		
		//z = ((x && y) || (x||y));
		//System.out.println("Value of z in Expression5 :  z = "+z);	

	

	
	}
}