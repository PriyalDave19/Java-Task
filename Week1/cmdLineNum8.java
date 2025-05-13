class cmdLineNum9{
	public static void main(String [] args){
		
		for(int i = 0 ;i <= args.length-1;i++){
			System.out.println(args[i]);
		}
	System.out.print("Reverse = ");
		for(int i = args.length-1 ;i >= 0 ;i--){
			System.out.print(args[i]+" ");
		}
	
		
	
	}
}