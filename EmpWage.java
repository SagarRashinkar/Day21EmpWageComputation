class EmpWage{

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int empRatePerHour = 20;

	public static void main(String[] args){

		int empWage = 0;
		int workHour = 0;

		int check = (int)(Math.random()*2)+1;
		
		switch(check){

			case isFullTime:
				workHour = 8;
				break;
			case isPartTime:
				workHour = 4;
				break;
			default:
				workHour = 0;
				break;
		}
		empWage = workHour * empRatePerHour;
		System.out.println("Emp wage: "+empWage);
	}
}
