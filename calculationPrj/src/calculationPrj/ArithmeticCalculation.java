package calculationPrj;


interface ArithmeticClass{
	double addition(double a, double b);
	double subtraction(double a, double b);
	double division(double a, double b);
	double multiply(double a, double b);
	double exponent(double a, double b);
	double squareRoot(double a);
	double log(double a);
	double nlog(double a);

}

public class ArithmeticCalculation extends Calculation implements ArithmeticClass {
	
	
  //operation methods  
	public double addition(double x, double y) {
		double c = x + y;
		return c;
	}

	public double subtraction(double a, double b) {
		double c = a - b;
		return c;
		
	}

	public double division(double a, double b) {
		double c = a / b;
		return c;
		
	}

	
	public double multiply(double a, double b) {
		double c = a * b;
		return c;
		
	}
    
	public double exponent(double a, double b) {
		double c = Math.pow(a, b);
		return c; 
	}

    public void squareRoot() {
    	System.out.println("hello there");
    }
	public double squareRoot(double a) {
		double c = Math.sqrt(a);
		return c;
	}
	public double nthroot(int n, double x) 
    {
        return nthroot(n, x, .0001);
    }
    public double nthroot(int n, double x, double p) 
    {
        if(x < 0) 
        {
            System.err.println("Root of Negative number doesn't exists !");
            return -1;
        }
        if(x == 0) 
            return 0;
        double x1 = x;
        double x2 = x / n;  
        while (Math.abs(x1 - x2) > p) 
        {
            x1 = x2;
            x2 = ((n - 1.0) * x2 + x / Math.pow(x2, n - 1.0)) / n;
        }
        return x2;
    }

	public double log(double a) {
		double c = Math.log10(a);
		return c;
	}
	public double nlog(double a) {
		double c = Math.log(a);
		return c; 
	}
    
	
    
}
