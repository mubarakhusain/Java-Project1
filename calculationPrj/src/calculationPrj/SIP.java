package calculationPrj;

public class SIP extends Calculation{

	public static double sip(double investAmount, double annualRate, double years) {
		double monthlyRate = annualRate / 12 / 100; // Rate of interest
		double months = years * 12; // Time period
		double futureValue = investAmount * (Math.pow(1 + monthlyRate, months) - 1) / monthlyRate;// Final Value
		return futureValue;
	}
	
}
