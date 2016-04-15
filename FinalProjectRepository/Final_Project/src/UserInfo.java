import java.util.Scanner;

public class UserInfo {

	public String userState;
	
	public String setUserState() {
			
			System.out.print("Type the capitalized, two-letter abbreviation of the state you will be working in this summer and press Enter.");
			Scanner scnr = new Scanner(System.in);
			userState = scnr.nextLine();
			scnr.close();
			return userState;
	}

}
