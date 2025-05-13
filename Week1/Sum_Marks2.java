
class Sum_Marks2{

	public static void main(String [] args){
		
		float s1,s2,s3,per;
		
		s1 = Float.parseFloat(args[0]);
		s2 = Float.parseFloat(args[1]);
		s3 = Float.parseFloat(args[2]);
		
		per = (s1+s2+s3) / 3;
		System.out.println("Percentage = "+per);
	}
}


/*
float per ,total=0;
		float s[] = new float[3];
		
		System.out.println("Enter Marks of 3 Subjects :");
		
		for(int i = 0 ; i < 3 ;i++){
			s[i] = Float.parseFloat(args[i]);
			total += s[i];
		}
		
		per = total/3;
		System.out.println("Percentage = "+per);

*/