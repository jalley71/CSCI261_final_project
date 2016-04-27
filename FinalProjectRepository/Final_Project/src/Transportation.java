import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Transportation{
	
	private double userGasPrice;
	private String stateAbbr;
	
	/**
	private String stateAbbr = UserInfo.stateAbbr;
	private double weeksWorked = UserInfo.weeksWorked;
	*/
	
	private String[] gasState = new String[50];
	private double[] gasPrice = new double[50];
		
	/**
	private double gasMileage = 0;
	private static int avgGasTankCapacity = 12;
	private double commuteDist = 0.0;
	private double totalCommuteDist = 0.0;
	public double transportationCost = 0.0;
	*/
	
	public void setstateAbbr(String state){
		this.stateAbbr = state;
	}
	
	
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
		Scanner scanner = null;
		try{
			scanner = new Scanner(new FileInputStream("GasPrices.txt"));
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
		}
		catch(FileNotFoundException e){
			
		}
		finally {
			if(scanner !=null)
				scanner.close();
		}
		
		
		
		int j = 0;
		for (j = 0; j < 50; ++j){
			if (gasState[j].equals(stateAbbr)) {
				userGasPrice = gasPrice[j];
			}
		}
		return userGasPrice;
	}
	
	/**
	public int getGasMileage(){
		Scanner scnr1 = new Scanner(System.in);
		System.out.println("Enter the gas mileage of the car you will be using this summer: ");
		gasMileage = scnr1.nextInt();
		scnr1.close();
		return gasMileage;
	}
	
	public double getCommuteDistance(){
		Scanner scnr2 = new Scanner(System.in);
		System.out.println("Enter the distance (to the nearest mile) of the commute to your summer job: ");
		String commuteDistString = scnr2.nextLine();
		commuteDist = Double.parseDouble(commuteDistString);
		totalCommuteDist = (2 * weeksWorked * commuteDist);
		scnr2.close();
		return totalCommuteDist;
	}
	
	public double getTransportationCost() {
		transportationCost = (userGasPrice * gasMileage * avgGasTankCapacity * totalCommuteDist);
		return transportationCost;
	}
	*/
}
