class EmpWage{

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int empRatePerHour = 20;

	public static void main(String[] args){

		int empWage = 0;
		int workHour = 0;

		int check = (int)(Math.random()*2)+1;
		
		if(check == 1){
			workHour = 8;
		}
		else if(check == 2){
			workHour = 4;
		}
		else{
			workHour = 0;
		}
		empWage = workHour * empRatePerHour;
		System.out.println("Emp wage: "+empWage);
	}
}
