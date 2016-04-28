

public class Tax {
	private String stateAbbr;
	private double statetax;
	private double gross_income;
	
	
	public void setstateAbbr(String state){
		this.stateAbbr = state;
	}
	
	public void setIncome(double gross_income){
		this.gross_income = gross_income;
	}			
	public double getfederaltax(){
		if (gross_income < 9275){
			return .10;
		}
		else{
		return .15;
		}
	}
	public double getstatetax(){
	if (stateAbbr.matches("ND|OH")){
		statetax = .011;
		return statetax;
	}
	if (stateAbbr.matches("CA|LA")){
		statetax = .02;
		return statetax;
	}
	if (stateAbbr.matches("NJ")){
		statetax = .014;
		return statetax;
	}
	if (stateAbbr.matches("AZ|KS")){
		statetax = .0265;
		return statetax;
	}
	if (stateAbbr.matches("CT|WV|PA")){
		statetax = .03;
		return statetax;
	}
	if (stateAbbr.matches("NM")){
		statetax = .032;
		return statetax;
	}
	if (stateAbbr.matches("AR|NE|VT")){
		statetax = .035;
		return statetax;
	}
	if (stateAbbr.matches("RI")){
		return .0375;
	}
	if (stateAbbr.matches("DE|MS|MO|MT|NY|OK|SC|WI")){
		return .04;
	}
	if (stateAbbr.matches("IA")){
		return .045;
	}
	if (stateAbbr.matches("MD")){
		return .0475;
	}
	if (stateAbbr.matches("AL|GA|ID|KY|NH|UT|VA|MA")){
		return .05;
	}
	if (stateAbbr.matches("MN")){
		return .0535;
	}
	if (stateAbbr.matches("HI")){
		return .055;
	}
	if (stateAbbr.matches("NC")){
		return .0575;
	}
	if (stateAbbr.matches("TN")){
		return .06;
	}
	if (stateAbbr.matches("OR")){
		return .07;
	}
	if (stateAbbr.matches("IN")){
		return .033*.125;
	}
	if (stateAbbr.matches("IL")){
		return .0375*.125;
	}
	if (stateAbbr.matches("MI")){
		return .0425*.125;
	}
	if (stateAbbr.matches("CO")){
		return .0463*.125;
	}
		
	return 0;	
	}

}
