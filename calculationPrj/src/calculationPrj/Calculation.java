package calculationPrj;

public abstract class Calculation {
	private Integer x;
	private Integer y;
	private Integer z;
	private double a;
	private double b;
	private double c;
	private String string;
	private double investment;
	private double annualRate;
	private double years;

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public double getAnnualRate() {
		return annualRate;
	}

	public void setAnnualRate(double annualRate) {
		this.annualRate = annualRate;
	}

	public double getYears() {
		return years;
	}

	public void setYears(double years) {
		this.years = years;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getZ() {
		return z;
	}

	public void setZ(Integer z) {
		this.z = z;

	}
}
