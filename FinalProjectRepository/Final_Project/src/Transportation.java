import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Transportation{
	
	public static double userGasPrice = 0.0;
	
	private static String stateAbbr = UserInfo.stateAbbr;
	private static String[] gasState = new String[50];
	private static double[] gasPrice = new double[50];
	
	public static void importGasPrices()throws IOException{	
		FileInputStream inputStream = new FileInputStream("GasPrices.txt");
		
		Scanner scanner = new Scanner(inputStream);
		
		String[] inputFromFile = new String[50];
		int i = 0;
		while(scanner.hasNext()){
			for (i = 0; i < 50; ++i){
				String line = scanner.nextLine();
				inputFromFile[i] = line;
				String delims = "[_]";
				String[] tokens = line.split(delims);
				gasState[i] = tokens[0];
				gasPrice[i] = Double.parseDouble(tokens[1]);
			}
		}
		inputStream.close();
		scanner.close();	
	}
	
	public static double setGasPrice(){
		int j = 0;
		for (j = 0; j < 50; ++j){
			if (gasState[j].equals(stateAbbr)) {
				userGasPrice = gasPrice[j];
			}
		}
		System.out.println(userGasPrice);
		return userGasPrice;
	}
	
}
