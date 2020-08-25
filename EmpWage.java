class EmpWage{

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int empRatePerHour = 20;
	public static final int workDayPerMonth = 20;
	public static final int totalWorkHour = 100;

	public static void main(String[] args){

		int empWage = 0;
		int workHour = 0;
		int totalEmpHour = 0;
		int totalEmpWage = 0;
		int totalWorkDays = 0;

		while(totalEmpHour <= totalWorkHour && totalWorkDays < workDayPerMonth){

			totalWorkDays++;
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
			totalEmpHour += workHour;
			empWage = workHour * empRatePerHour;
			totalEmpWage += empWage;
			System.out.println("Emp wage of day "+totalWorkDays+ " is :"+empWage);
		}
		System.out.println("Employee wage for a month is:"+totalEmpWage);
	}
}
