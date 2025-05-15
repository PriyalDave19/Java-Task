import java.util.Scanner;
class LucasSeries5{
	public static void main(String [] args){
		int n ,c, t= -1 , p = 3 ;
		System.out.println("Enter any NUmber =");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 2 ; i <= n ; i++){
			c = t+p;
			System.out.println(" "+c);
			
			p = t ;
			t = c;
			
		}
		
	}
}


/*
	2, 1, 3, 4, 7, 11, 18, 29, 47, 76, 123 …………..
	
	-1 + 3 = 2
	2 + -1 = 1 
	1 + 2 =  3 
	3 + 
	 
*/

/*
0 1 1 2 3 5  8 13 21 34.....
*/