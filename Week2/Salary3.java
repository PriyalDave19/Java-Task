import java.util.Scanner;
class Salary3{
	public static void main(String [] args){
		int bs;
		float hra = 1,da = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary = ");
		bs = sc.nextInt();
		
		if(bs < 1500){
			hra = (bs*10)/100;
			da = (bs*90)/100;
		}else{
			hra = 500;
			da  = (bs*98)/100;
		}
		
		System.out.println("HRA = "+hra+"\tDA = "+da+"\tBasic Salary = "+bs+"\tTotal Salary = "+(bs+hra+da));
	}
}