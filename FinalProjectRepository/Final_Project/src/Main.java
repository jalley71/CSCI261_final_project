import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
	
	Income Income = new Income(); //Creates New Income Class
	
	Income.setemploymentDuration(9); //Duration of employment. Ex) 9 (weeks) 2.5 (days)
	Income.setemploymentdurationType("W"); //What unit is being used to measure this "H" Hours 
										//"D"Days, "W" Weeks, "M" Months, "S" Summer
	
	Income.setpayType("H"); //What is your pay measured in Hours? Days? Weeks? Months? Summer?
	Income.setpay(19); //How much are you paid per hour, per day, per summer...

	Income.sethoursperDay(8); //How many hours do you expect to work? (Type any number unless you are paid on an hourly basis)
	
	System.out.println(Income.getsummerIncome());
		
	/*UserInfo UserInfo = new UserInfo();
	UserInfo.setUserState();
	UserInfo.setWeeksWorked();
	
	Housing Housing = new Housing();
	Housing.getHousingDuration();
	Housing.getPaymentPeriod();
	Housing.getHousingCost();
	
	Transportation Transportation = new Transportation();
	Transportation.importGasPrices();
	Transportation.getGasPrice();
	Transportation.getGasMileage();
	Transportation.getCommuteDistance();
	Transportation.getTransportationCost();*/
	
	
	}
}
