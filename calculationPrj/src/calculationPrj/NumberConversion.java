package calculationPrj;



interface numberConvert{
	double BinaryToDecimal(String a);
	String DecimalToBinary(Integer a);
}

public class NumberConversion extends Calculation implements numberConvert{
	
	public double BinaryToDecimal(String a) {
		return Integer.parseInt(a, 2);
	}

	public String DecimalToBinary(Integer a) {
		
		return Integer.toBinaryString(a);
	}
 
}
