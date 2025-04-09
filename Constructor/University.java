class University{
	
	static class Department{
		int fno;
		String  dname;
		
		Department(String  dname,int fno){
			this.dname = dname;
			this.fno = fno;
		}
		void displayInfo(){
			System.out.println("Parameterized Constructor : ");
			System.out.println("Department Name = "+dname);
			System.out.println("Number of Faculty Member = "+fno);
		}
		
		}
		public static void main(String [] args){
		
		Department d1 = new Department("Universal Infotics" , 500);
		d1.displayInfo();
	}

}