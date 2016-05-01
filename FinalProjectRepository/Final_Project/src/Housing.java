import java.util.Scanner;

public class Housing {

private double housingDuration = 0.0;
private double housingPayment = 0.0;
private String paymentPeriod = "W";
public double housingCost = 0.0;

	public void sethousingDuration(double duration){
		this.housingDuration = duration;
	}
	public void setrent(double payment){
		this.housingPayment = payment;
	}
	public void setrentPeriod(String payment_Period){
		this.paymentPeriod = payment_Period;
	}
	public double gethousingCost(){
		if (paymentPeriod == "W"){
			housingCost = housingPayment * housingDuration;
			return housingCost;
		}
		if (paymentPeriod == "M"){
			housingCost = (housingPayment/4)* housingDuration;
			return housingCost;
		}
		if (paymentPeriod == "S"){
			housingCost = housingPayment;
			return housingCost;
		}
		return 0;
	}

}