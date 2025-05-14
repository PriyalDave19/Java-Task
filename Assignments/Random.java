class Random{
	
	public static void main(String [] args){
		int i;
		int a[] = new int[10];
		for(i = 0 ; i < 10 ; i++){
			a[i] = (int)(Math.random()*50)+1;
			for(int j = 0 ;j < 10 ; j++){
				
				if(a[i] == a[j]){
					a[i] = (int)(Math.random()*50)+1;
				}
			}
		}
		
		for(i = 0 ; i < 10 ; i++)
			System.out.println(a[i]+" ");
	}
}