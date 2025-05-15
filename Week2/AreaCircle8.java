import java.util.Scanner;
class AreaCircle8{	
	
	float r, area;
	float pie = 3.14f;
	
	public static void main(String [] args){
		
		AreaCircle8 obj = new AreaCircle8();
		obj.init();
		obj.calc();
		obj.display();
	
	}
	void init(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius of a Circle :");
		r = sc.nextInt();
		}
	
		void calc(){
		area = pie*r*r;
		}
	
		void display(){
		System.out.println("Area of a Circle :"+area);
		}
}