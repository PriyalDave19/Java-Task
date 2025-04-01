import java.util.Scanner;
class Prime_Series{
	public static void main(String [] args){
		int i ,j, n ,count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N = ");
		n = sc.nextInt();
		
		for(i = 1 ; i <= n ;i++){
			count=0;
		
		for(j = 1 ; j <=i ;j++)
		{
			if(i%j == 0){
				count++;
			}
			
		}
		if(count == 2 ){
				System.out.print(i+" ");
			}
		
		}
		
	}
}

 // 2 3 5 7 11 13 17 ..............