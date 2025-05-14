import java.util.Scanner;
class TemperatureConverter11{
	public static void main(String [] args){
		float f;
		float c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Fehrenheit to be converted in Celcius:");
		f = sc.nextInt();
		
		c = 5*(f-32)/9.0f;
		
		System.out.println(f + "  f =  "+c+" degrees");
		
	} 
	
}