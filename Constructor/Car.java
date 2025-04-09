class Car{
	
	int year;
	String model,make;
	
	Car(int year , String model ,String make){
		
		this.year = year ;
		this.model = model;
		this.make = make;
		
		System.out.println("Parameterized Constructor : ");
		System.out.println("Year = "+year);
		System.out.println("Model = "+model);
		System.out.println("Make = "+make);
	}
	
	public static void main(String [] args){
		
		Car p2 = new Car(5 , "Thar" , "Mahindra & Mahindra Ltd.");
	
	}

}
