import java.util.Scanner;
class Days_Months_4{
	public static void main(String [] args){
		int days , month=0 , year = 0;
		int d = 0;
		Scanner sc = new Scanner(System.in);
		days = sc.nextInt();
		
	while(days != 0){
		
		if(days > 365){
			year++;
			days = days - 365 ;
		}
		else if (month > 30){
			month ++ ;
			days -= 30;
		}
		else{
			d = d + days;
			days = 0;
		}
	}
	System.out.println(year+"  Year	"+month+"  Month  "+d+"  days");
		
	
	
	}
}

// 1 month = 31 days;
// 1 year = 365 days;
// leap year = 366 days;
