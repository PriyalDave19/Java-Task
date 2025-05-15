import java.util.Scanner;
class ArrDescending6{
	
	public static void main(String [] args){
	
	int arr [] = new int[10];
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter elements in an Array :");
	
	for(int i = 0 ; i < 10 ; i++){
		arr[i] = sc.nextInt();
	}
	for(int i = 0 ; i < 10 ; i++){
		System.out.print(arr[i]+"\t");
	}
	
	System.out.print("\n\n");

	for(int i = 0 ; i < 10 ; i++){
	
		for(int j = 0 ; j < 9 ; j++){
			if(arr[i]>arr[j]){
				arr[i] = arr[i] + arr[j];
				arr[j] = arr[i] - arr[j];
				arr[i] = arr[i] - arr[j];	
			}
		}
	}
	System.out.print("\nDescending Order: \n");
	for(int i = 0 ; i < 10 ; i++){
		System.out.print(arr[i]+"\t");
	}
	}
}