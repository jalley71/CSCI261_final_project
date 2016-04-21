import java.util.Scanner;

public class UserInfo {

	public static String stateAbbr = "CA";
	public static int weeksWorked = 0;
	
	public String setUserState() {
		System.out.println("Type the capitalized, two-letter abbreviation of the state"
				+ "/n" + "you will be working in this summer and press Enter.");
		Scanner scnr = new Scanner(System.in);
		stateAbbr = scnr.nextLine();
		scnr.close();
		return stateAbbr;
	}
	
	public int setWeeksWorked() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the number of weeks you will work this summer"
				+ "/n" + "(round to the nearest week): ");
		weeksWorked = scnr.nextInt();
		scnr.close();
		return weeksWorked;
	}

}
