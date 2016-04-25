import java.util.Scanner;

public class UserInfo {

	public static String stateAbbr = "CA";
	public static double weeksWorked = 2.0;
	
	public String setUserState() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Type the capitalized, two-letter abbreviation of the state"
				+ "\n" + "you will be working in this summer and press Enter.");
		stateAbbr = scnr.nextLine();
		scnr.close();
		System.out.println(stateAbbr);
		return stateAbbr;
	}
	
	public double setWeeksWorked() {
		Scanner scnr1 = new Scanner(System.in);
		System.out.println("Enter the number of weeks you will work this summer"
				+ "/n" + "(round to the nearest week): ");
		String weeksWorkedString = scnr1.nextLine();
		weeksWorked = Double.parseDouble(weeksWorkedString);
		scnr1.close();
		return weeksWorked;
	}

}
