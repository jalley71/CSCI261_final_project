
public class Income {
	
	public double summerIncome;
	public int hoursWorked;
	public int hourlyIncome;
	
	/**
	 * Possible inputs for Duration: Month(M), Day(D), Week(W)
	 * Possible forms of payment: Hour(H), Weekly(W), Monthly(M), Summer(S)
	 */
	
	/**
	 * Sets up input for income for use-able calculations
	 */
	public Income(){
		summerIncome = 0;
	}
	/**
	 * 
	 * @param payPeriod: Are you measuring the time you pay in Month Week Day or Hour, E.g 2.5 months, 4 weeks
	 * @param payType: Hourly/Daily/Weekly/Monthly/Summer Pay
	 * @param pay: How much are you paid over this
	 * @param payDuration: How long will you be working for, 6 weeks, 2.5 months, 1 summer
	 * @param hourperDay: How many hours do you work each day?
	 */
	
	public Income(String payPeriod, String payType, double pay, double payDuration, int hourperDay){
		if (payType == "S"){
			summerIncome = pay;
		}
		if (payPeriod =="M"){
			if (payType =="M"){
				summerIncome = pay*payDuration;
			}	
			if (payType =="W"){
				summerIncome = (payDuration * 4)*pay;
			}
			if (payType =="D"){
				summerIncome = (payDuration * 4 * 5)*pay;
			}
			if (payType =="H"){
				summerIncome = (payDuration * 4 * 5 * hourperDay)*pay;
			}
		}
		if (payPeriod =="W"){
			if (payType =="M"){
				summerIncome = (payDuration / 4)*pay;
			}
			if (payType =="W"){
				summerIncome = (payDuration)*pay;
			}
			if (payType =="D"){
				summerIncome = (payDuration * 5)*pay;
			}
			if (payType =="H"){
				summerIncome = (payDuration * 5 * hourperDay)*pay;
			}
		}
		if (payPeriod =="D"){
			if (payType =="M"){
				summerIncome = (payDuration / (4 * 5) )*pay;
			}
			if (payType =="W"){
				summerIncome = (payDuration / 5)*pay;
			}
			if (payType =="D"){
				summerIncome = (payDuration)*pay;
			}
			if (payType =="H"){
				summerIncome = (payDuration*hourperDay)*pay;
			}
			
		}
		if (payPeriod =="H"){
			if (payType =="M"){
				summerIncome = (payDuration / (4 * 5* hourperDay) )*pay;
			}
			if (payType =="W"){
				summerIncome = (payDuration / (5 * hourperDay) )*pay;
			}
			if (payType =="D"){
				summerIncome = (payDuration / hourperDay)*pay;
			}
			if (payType =="H"){
				summerIncome = (payDuration)*pay;
			}
		}
		
	}

	public double getSummerIncome(){
		return summerIncome;
	}
	

}

















