import java.util.Scanner;
class Table4{
	public static void main(String [] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("NUMBER = ");
		n = sc.nextInt();
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println(n+" * "+i+" = "+(n*i));

		
		}
	}
}