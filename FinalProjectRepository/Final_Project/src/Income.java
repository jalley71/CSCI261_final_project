
public class Income {
	
	public final double hoursWorked;
	public final double hourlyPay;
	
	private double employmentDuration;
	private double pay;
	private double hoursperDay;
	
	private String payType;
	private String payPeriod;
	
	public double summerIncome;
	
	/**
	 * Possible inputs for payDuration: Month(M), Day(D), Week(W)
	 * Possible forms of payment: Hour(H), Weekly(W), Monthly(M), Summer(S)
	 */
	
	/**
	 * Sets up input for income for use-able calculations
	 */
	public Income(){
		hoursWorked = 0;
		hourlyPay = 0;
		payType = "H";
		pay = 0;
	}
	public void setemploymentDuration(double Duration){
		this.employmentDuration = Duration;
	}
	public void setemploymentdurationType(String employmentdurationType){
		this.payPeriod = employmentdurationType;
	}	
	public void setpayType(String typeofPay){
		this.payType = typeofPay;
	}
	public void setpay(double Wage){
		this.pay = Wage;
	}

	
	public void sethoursperDay(double hourperday){
		this.hoursperDay = hourperday;
	}
	
	/**
	 * 
	 * @param payPeriod: Are you measuring the time you pay in Month Week Day or Hour, E.g 2.5 months, 4 weeks
	 * @param payType: Hourly/Daily/Weekly/Monthly/Summer Pay
	 * @param pay: How much are you paid over this
	 * @param payDuration: How long will you be working for, 6 weeks, 2.5 months, 1 summer
	 * @param hourperDay: How many hours do you work each day?
	 */
	
	public double getsummerIncome(){
		if (payType == "S"){
			summerIncome = pay;
			return summerIncome;
		}
		if (payPeriod =="M"){
			if (payType =="M"){
				summerIncome = pay*employmentDuration;
				return summerIncome;
			}	
			if (payType =="W"){
				summerIncome = (employmentDuration * 4)*pay;
				return summerIncome;
			}
			if (payType =="D"){
				summerIncome = (employmentDuration * 4 * 5)*pay;
				return summerIncome;
			}
			if (payType =="H"){
				summerIncome = (employmentDuration * 4 * 5 * hoursperDay)*pay;
				return summerIncome;
			}
		}
		if (payPeriod =="W"){
			if (payType =="M"){
				summerIncome = (employmentDuration / 4)*pay;
				return summerIncome;
			}
			if (payType =="W"){
				summerIncome = (employmentDuration)*pay;
				return summerIncome;
			}
			if (payType =="D"){
				summerIncome = (employmentDuration * 5)*pay;
				return summerIncome;
			}
			if (payType =="H"){
				summerIncome = (employmentDuration * 5 * hoursperDay)*pay;
				return summerIncome;
			}
		}
		if (payPeriod =="D"){
			if (payType =="M"){
				summerIncome = (employmentDuration / (4 * 5) )*pay;
				return summerIncome;
			}
			if (payType =="W"){
				summerIncome = (employmentDuration / 5)*pay;
				return summerIncome;
			}
			if (payType =="D"){
				summerIncome = (employmentDuration)*pay;
				return summerIncome;
			}
			if (payType =="H"){
				summerIncome = (employmentDuration*hoursperDay)*pay;
				return summerIncome;
			}
			
		}
		if (payPeriod =="H"){
			if (payType =="M"){
				summerIncome = (employmentDuration / (4 * 5* hoursperDay) )*pay;
				return summerIncome;	
			}
			if (payType =="W"){
				summerIncome = (employmentDuration / (5 * hoursperDay) )*pay;
				return summerIncome;
			}
			if (payType =="D"){
				summerIncome = (employmentDuration / hoursperDay)*pay;
				return summerIncome;
			}
			if (payType =="H"){
				summerIncome = (employmentDuration)*pay;
				return summerIncome;
			}
		}
	return summerIncome;
	}
}

















