class MathDemo{
	public static void main(String []args){
	
		int i , a[] = new int[10];
		int f = 0;
		for(i = 0 ; i<10 ; i++){
			a[i] = (int)(Math.random()*50+1);
			//System.out.print(" "+a[i]);
		}
		
		for(i = 0 ; i<10 ; i++){
			f=0;
			for(int j = i+1; j<10 ; j++){
				if(j == 9)
					break;
				if(a[i] != a[j]){
					f++;
				}
				
			if(f == 1)
				System.out.print(" "+a[i]);
			}
		
		}
		
	}
}
