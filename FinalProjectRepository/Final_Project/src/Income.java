
public class Income {
	
	private double payDuration;
	private double pay;
	private double hoursperDay;
	
	private String payType;
	private String payPeriod;
	
	
	public double summerIncome;
	public final double hoursWorked;
	public final double hourlyPay;
	
	/**
	 * Possible inputs for Duration: Month(M), Day(D), Week(W)
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
	public void setpayDuration(double Duration){
		this.payDuration = Duration;
	}
	public void setpayType(String typeofPay){
		this.payType = typeofPay;
	}
	public void setpay(double Wage){
		this.pay = Wage;
	}
	public void setpayPeriod(String paymentPeriod){
		this.payPeriod = paymentPeriod;
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
				summerIncome = pay*payDuration;
				return summerIncome;
			}	
			if (payType =="W"){
				summerIncome = (payDuration * 4)*pay;
				return summerIncome;
			}
			if (payType =="D"){
				summerIncome = (payDuration * 4 * 5)*pay;
				return summerIncome;
			}
			if (payType =="H"){
				summerIncome = (payDuration * 4 * 5 * hoursperDay)*pay;
				return summerIncome;
			}
		}
		if (payPeriod =="W"){
			if (payType =="M"){
				summerIncome = (payDuration / 4)*pay;
				return summerIncome;
			}
			if (payType =="W"){
				summerIncome = (payDuration)*pay;
				return summerIncome;
			}
			if (payType =="D"){
				summerIncome = (payDuration * 5)*pay;
				return summerIncome;
			}
			if (payType =="H"){
				summerIncome = (payDuration * 5 * hoursperDay)*pay;
				return summerIncome;
			}
		}
		if (payPeriod =="D"){
			if (payType =="M"){
				summerIncome = (payDuration / (4 * 5) )*pay;
				return summerIncome;
			}
			if (payType =="W"){
				summerIncome = (payDuration / 5)*pay;
				return summerIncome;
			}
			if (payType =="D"){
				summerIncome = (payDuration)*pay;
				return summerIncome;
			}
			if (payType =="H"){
				summerIncome = (payDuration*hoursperDay)*pay;
				return summerIncome;
			}
			
		}
		if (payPeriod =="H"){
			if (payType =="M"){
				summerIncome = (payDuration / (4 * 5* hoursperDay) )*pay;
				return summerIncome;	
			}
			if (payType =="W"){
				summerIncome = (payDuration / (5 * hoursperDay) )*pay;
				return summerIncome;
			}
			if (payType =="D"){
				summerIncome = (payDuration / hoursperDay)*pay;
				return summerIncome;
			}
			if (payType =="H"){
				summerIncome = (payDuration)*pay;
				return summerIncome;
			}
		}
	return summerIncome;
	}
}

















