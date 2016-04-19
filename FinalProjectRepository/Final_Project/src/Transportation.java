import java.io.FileInputStream;
import java.util.Scanner;

public class Transportation {

	public static void main(String [] args) throws IOException {
		
	String[] gasState = new String[50];
	double[] gasPrice = new double[50];
	
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
	
		
	}
}
