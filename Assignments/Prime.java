import java.util.Scanner;
class Prime{
	public static void main(String [] args){
		int i ,j, n ,count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N = ");
		n = sc.nextInt();
        
		for(j = 2 ; j <= n ; j++){
			count = 0;
			for(i = 2 ; i < j ; i++){
			if(j%i == 0)
				count ++;
		}
			if(count == 0)
			System.out.print(j+"  ");
		}

}
}

// 2 , 3 , 5 , 7 , 11