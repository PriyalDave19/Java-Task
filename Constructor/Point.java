class Point{
	
	int x,y;
	
	Point(){
		x = 12;
		y = 45;
		System.out.println("Default Constructor : ");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	Point(int x , int y){
		this.x = x;
		this.y = y;
		System.out.println("Parameterized Constructor 1 : ");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	Point(double x , double y){
		System.out.println("Parameterized Constructor 2 : ");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	public static void main(String [] args){
		Point p1 = new Point();
		Point p2 = new Point(125 , 452);
		Point p3 = new Point(452.4 , 33.3);
	}

}
