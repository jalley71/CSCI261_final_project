import java.util.Scanner;

public class Housing {

private double housingDuration = 0.0;
private double housingPayment = 0.0;
private char paymentPeriod = 'W';
public double housingCost = 0.0;

	public double getHousingDuration(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter how many weeks you will be paying for housing this summer: ");
		housingDuration = scnr.nextDouble();
		scnr.close();
		return housingDuration;	
	}	
	public char getPaymentPeriod(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("How often will you be making housing payments?"
				+ "\n" + "Enter W for weekly, M for monthly, and S if one bulk payment will be paid: ");
		String paymentPeriodString = scnr.next();
		scnr.close();
		paymentPeriod = paymentPeriodString.charAt(0);
		return paymentPeriod;	
	}
	public double getHousingPayment(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your weekly/monthly/total housing payment,"
				+ "\n" + "based on the letter you entered above: ");
		housingPayment = scnr.nextDouble();
		scnr.close();
		return housingPayment;
	}
	public double getHousingCost(){
		if (paymentPeriod == 'W'){
			housingCost = housingPayment * housingDuration;
		}else if(paymentPeriod == 'M'){
			housingCost = housingPayment * (housingDuration/4.0);
		}else if(paymentPeriod == 'S'){
			housingCost = housingPayment;
		}else{
			System.out.println("Error. You must enter W, M, or H to the question:"
					+ "\n" + "How often will you be making housing payments?");
			getPaymentPeriod();
			getHousingCost();
		}
		return housingCost;
	}
}