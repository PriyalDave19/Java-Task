class Person9{
	
	int  age = 18;
	String name;
	
	Person9(int age , String name){
		this.age = age;
		this.name = name;
	}
	
	public static void main(String [] args){
		Person9 obj = new Person9(22 , "Priyal Dave");
		obj.display();
	}
	
	void display(){
		System.out.println("Name = "+name);
		System.out.println("age = "+age);
	}

}