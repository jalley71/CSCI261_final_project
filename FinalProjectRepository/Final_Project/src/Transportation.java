import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Transportation{
	
	private double userGasPrice;
	private String stateAbbr;
	private double gasMileage;
	private double commuteDistance;
	private double weeksWorked;
	public double transportationCost;
	
		
	public void setstateAbbr(String state){
		this.stateAbbr = state;
	}
			
	public double getGasPrice(){
		HashMap<String,Double> gasPrice = new HashMap<String,Double>();
		
		gasPrice.put("AL", 1.875);
		gasPrice.put("AK", 2.310);
		gasPrice.put("AZ", 2.127);
		gasPrice.put("AR", 1.878);
		gasPrice.put("CA", 2.775);
		gasPrice.put("CO", 1.983);
		gasPrice.put("CT", 2.192);
		gasPrice.put("DE", 1.977);
		gasPrice.put("FL", 2.054);
		gasPrice.put("GA", 2.013);
		gasPrice.put("HI", 2.612);
		gasPrice.put("ID", 2.114);
		gasPrice.put("IL", 2.168);
		gasPrice.put("IN", 2.121);
		gasPrice.put("IA", 2.034);
		gasPrice.put("KS", 1.902);
		gasPrice.put("KY", 2.072);
		gasPrice.put("LA", 1.868);
		gasPrice.put("ME", 2.138);
		gasPrice.put("MD", 2.081);
		gasPrice.put("MA", 2.083);
		gasPrice.put("MI", 2.118);
		gasPrice.put("MN", 1.987);
		gasPrice.put("MS", 1.863);
		gasPrice.put("MO", 1.877);
		gasPrice.put("MT", 2.004);
		gasPrice.put("NE", 2.047);
		gasPrice.put("NV", 2.439);
		gasPrice.put("NH", 2.041);
		gasPrice.put("NJ", 1.929);
		gasPrice.put("NM", 1.925);
		gasPrice.put("NY", 2.216);
		gasPrice.put("NC", 1.980);
		gasPrice.put("ND", 1.982);
		gasPrice.put("OH", 2.116);
		gasPrice.put("OK", 1.867);
		gasPrice.put("OR", 2.194);
		gasPrice.put("PA", 2.248);
		gasPrice.put("RI", 2.119);
		gasPrice.put("SC", 1.868);
		gasPrice.put("TN", 1.897);
		gasPrice.put("TX", 1.881);
		gasPrice.put("UT", 2.112);
		gasPrice.put("VT", 2.127);
		gasPrice.put("VA", 1.902);
		gasPrice.put("WA", 2.303);
		gasPrice.put("WI", 2.054);
		gasPrice.put("WY", 2.009);
		
		userGasPrice = gasPrice.get(stateAbbr);
	
		return userGasPrice;
	}
	
	
	public double setGasMileage(double mileage){
		this.gasMileage = mileage;
		return gasMileage;
	}
	
	public double setCommuteDistance(double commute) {
		this.commuteDistance = commute;
		return commuteDistance;
	}
	
	public double setCommuteWeeks(double duration) {
		this.weeksWorked = duration;
		return weeksWorked;
	}
	
	public double getTransportationCost() {
		transportationCost = (weeksWorked * commuteDistance * 10 * userGasPrice / gasMileage);
		return transportationCost;
	}
	
}
