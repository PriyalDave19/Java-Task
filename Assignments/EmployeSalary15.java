import java.util.Scanner;
class EmployeSalary15{
	public static void main(String [] args){
		float bs ,hra,da ,gs;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Basic Salary : ");
		bs = sc.nextFloat();
		
		if(bs >= 1500){
			hra = 500;
			da = (bs * 98)/100;
		}
		else{
			hra =  (bs * 10 )/100 ;
			da = (bs * 90)/100;
		}
		gs = bs + da +hra;
		System.out.print("Basic Salary = "+bs+"\nHRA = "+hra+"\nDA = "+da+"\nGS = "+gs);
	}
}