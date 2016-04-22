import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Transportation{
	
	public double userGasPrice = 0.0;
	
	private String stateAbbr = UserInfo.stateAbbr;
	private int weeksWorked = UserInfo.weeksWorked;
	
	private String[] gasState = new String[50];
	private double[] gasPrice = new double[50];
	
	private int gasMileage = 0;
	private static int avgGasTankCapacity = 12;
	private int commuteDist = 0;
	private int totalCommuteDist = 0;
	public double transportationCost = 0.0;
	
	public void importGasPrices()throws IOException{	
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
	
	public double getGasPrice(){
		int j = 0;
		for (j = 0; j < 50; ++j){
			if (gasState[j].equals(stateAbbr)) {
				userGasPrice = gasPrice[j];
			}
		}
		System.out.println(userGasPrice);
		return userGasPrice;
	}
	
	public int getGasMileage(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the gas mileage of the car you will be using this summer: ");
		gasMileage = scnr.nextInt();
		scnr.close();
		return gasMileage;
	}
	
	public int getCommuteDistance(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the distance (to the nearest mile) of the commute to your summer job: ");
		commuteDist = scnr.nextInt();
		scnr.close();
		totalCommuteDist = (2 * weeksWorked * commuteDist);
		return totalCommuteDist;
	}
	
	public double getTransportationCost() {
		transportationCost = (userGasPrice * gasMileage * avgGasTankCapacity * totalCommuteDist);
		return transportationCost;
	}
}
