
public class Main {
	public static void main(String[] args) {
	
	Income Income = new Income(); //Creates New Income Class
	
	Income.setpayDuration(9); //Duration of employment. Ex) 9 (weeks) 2.5 (days)
	Income.setpayPeriod("W"); //What unit is being used to measure this
	
	Income.setpayType("H"); //What is your pay measured in Hours? Days? Weeks? Months? Summer?
	Income.setpay(19); //How much are you paid per hour, per day, per summer...

	Income.sethoursperDay(8); //How many hours do you expect to work? (Type any number if you are only paid on an hourly basis)
	
	System.out.println(Income.getsummerIncome());

	}

}
