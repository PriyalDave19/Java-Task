class Armstrong_Series{
	public static void main(String [] args){
		int n,rem,p ,i , ct ,sm , k;
		System.out.println("Enter num");
	
		for(i = 100 ; i <= 50000; i++){
			n = i ;
			ct = 0;
			// Counting...........
			while(n != 0){ 
				ct++;   			
				n = n/10;  		   
				System.out.println(ct);
			}
			n = i;
			sm = 0 ;
			while(n != 0){
				rem = n%10;   // 0 , 0 , 1
				n = n/10;
				p=1;
				System.out.println();
				
				for(k = 0 ; k < ct ; k++){
					p = p*rem;
				}
				sm += p;
				n = i;
				
			}
			
			if(sm == i)
					System.out.println("Arm ="+sm);
			
		}
		
	}
}


//  153 = 1 * 1 * 1 + 5*5*5 + 3*3*3 = 153 