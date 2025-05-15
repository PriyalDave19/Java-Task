import java.util.Scanner;
class Product10{

	int pid , price , quantity;
	
	Product10(int pid , int price , int quantity){
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
		
	
}

class XYZ10{
	
	public static void main(String [] args){
		
		Product10 obj = new Product10(1 , 15000 , 5);
		
		int pid[] = new int[5];
		int price[] = new int[5];
		int quantity[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Information of 5 Product:");
		
		for(int i = 0 ; i < 5 ; i++){
			System.out.println("Enter Product id for "+(i+1)+"st Product");
			pid[i] = sc.nextInt();
			System.out.println("Enter Product price for "+(i+1)+"st Product");
			price[i] = sc.nextInt();
			System.out.println("Enter Product Quantity for "+(i+1)+"st Product");
			quantity[i] = sc.nextInt();
		}
		
		System.out.println("Product With Highest Price = ");
		
		
		for(int i = 0 ; i < 5 ; i++){
			for(int j = i+1 ;j < 5 ; j++){
				
				if(price[i] > price[j]){
					System.out.println("\n\n pid = "+pid[i]);
				}
			}
			
		}
		
		
	}
	
}