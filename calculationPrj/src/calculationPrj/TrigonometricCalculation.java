package calculationPrj;



interface trigoCalculation {
	double sine(double a);

	double cosine(double a);

	double tangent(double a);

	double sinInverse(double a);

	double cosInverse(double a);

	double tanInverse(double a);

}

public class TrigonometricCalculation extends Calculation implements trigoCalculation {

	public double sine(double a) {
		double c = Math.toRadians(a);
		return Math.sin(c);
	}

	public double cosine(double a) {
		double c = Math.toRadians(a);
		return Math.cos(c);
	}

	public double tangent(double a) {
		double c = Math.toRadians(a);
		return Math.tan(c);
	}


	public double sinInverse(double a) {
		double c = Math.toRadians(a);
		return Math.asin(c);
	}


	public double cosInverse(double a) {
		double c = Math.toRadians(a);
		return Math.acos(c);
	}

	@Override
	public double tanInverse(double a) {
		double c = Math.toRadians(a);
		return Math.atan(c);
	}

}
