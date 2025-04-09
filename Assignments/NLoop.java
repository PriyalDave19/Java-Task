import java.util.Scanner;
class NLoop{
	public static void main(String [] args){
		
		int i ,j,k,n;
		char p = 'A';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("N = ");
		n = sc.nextInt();
		
		for(i = 0 ; i < n ;i++){
			for(k = n-i-1; k > 0; k--){
				System.out.print(" ");
			}
			p ='A';
			for(j = 1; j <= i+1 ;j++){
				System.out.print(p);
				p++;
			}
			p = 'A';
			for(j = i; j >= 1 ;j--){
				System.out.print(p);
			}
			System.out.print("\n");
		}
	}
}