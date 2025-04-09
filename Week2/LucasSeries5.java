import java.util.Scanner;
class LucasSeries5{
	public static void main(String [] args){
		int n ,c, t= 1 , p = -1;
		System.out.println("Enter any NUmber =");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++){
			c = t+p;
			System.out.println(" "+c);
			
			p = t ;
			t=c;
			
		}
		
	}
}


/*
	1 , 2 , 3 , 6 ,11 , 20, 37
   2 + 1 = 1 
   1 + 1 = 2 
   1 + 2 = 3
   2 + 3  = 
*/

/*
0 0 1 2 3 5  8 13 21 34.....
*/