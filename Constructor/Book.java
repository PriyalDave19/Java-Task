class Book{
	
	int price;
	String title,author;
	
	Book(){
		title = "Books :";
		System.out.println("Default Constructor : ");
		System.out.println("Title = "+title);
	}
	
	Book(String title , String author){
		this.title = title;
		this.author = author;
		System.out.println("\nParameterized Constructor : ");
		System.out.println("Title = "+title);
		System.out.println("Author = "+author);
	}
	
	Book(String title , String author , int price){
		this.title = title;
		this.author = author;
		this.price = price;
		System.out.println("\nParameterized Constructor : ");
		System.out.println("Title = "+title);
		System.out.println("Author = "+author);
		System.out.println("Price = "+price);
	}

	public static void main(String [] args){
		Book b1 = new Book();
		Book b2 = new Book("C Programming","Dennish Ritchie");
		Book b3 = new Book("Java Programming","E.Balguruswamy",560);
		
	}

}
