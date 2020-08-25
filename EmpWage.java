class EmpWage{

	public static void main(String[] args){
	
		int isFullTime = 1;
		int empRatePerHour = 20;

		int empWage = 0;
		int workHour = 0;

		int check = (int)(Math.random()*2)+1;
		if(check == isFullTime){
		
			workHour = 8;
		}
		else{
		
			workHour = 0;
		}
		empWage = workHour * empRatePerHour;
		System.out.println("Emp wage: "+empWage);

	}
}

