import java.io.*;
class Swap7{
	public static void main(String [] args){
	
	try{
		
		int a , b;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		
		a = Integer.parseInt(bf.readLine());
		b = Integer.parseInt(bf.readLine());
		
		System.out.println("Before Swapping a = "+a+"\t b ="+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping a = "+a+"\t b ="+b);
		
	}catch(Exception e){
		System.out.println(e);
	}
	}
}