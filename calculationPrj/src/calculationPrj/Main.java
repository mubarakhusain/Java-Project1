package calculationPrj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	// method for addition
	public static void addition() {
		double x;
		double y;
		double z;
		int out = 4;
		ArithmeticCalculation a = new ArithmeticCalculation();

		Scanner sc = new Scanner(System.in);
		while (true) {

			try {
				if (out != 10) {
                    
					System.out.println("Please Enter two numbers for Addition");
					x = sc.nextDouble();
					a.setA(x);
					System.out.println("First number " + a.getA());
					y = sc.nextDouble();
					a.setB(y);
					System.out.println("Second number " + a.getB());
					z = a.addition(a.getA(), a.getB());
					System.out.println("Result " + z);
					System.out.println("To stop Addition calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();
					 
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input and try again !\n ");
				break;
			}

		}
		;

	}

	// method for subtract
	public static void subtract() {
		double x;
		double y;
		double z;
		int out = 4;
		ArithmeticCalculation a = new ArithmeticCalculation();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
				
					System.out.println("Please Enter two numbers for Subtract");
					x = sc.nextDouble();
					a.setA(x);
					System.out.println("First number " + a.getA());
					y = sc.nextDouble();
					a.setB(y);
					System.out.println("Second number " + a.getB());
					z = a.subtraction(a.getA(), a.getB());
					System.out.println("Result " + z);
					System.out.println("To stop Subtraction calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}

	}

	// method for multiply
	public static void multiply() {
		double x;
		double y;
		double z;
		int out = 4;
		ArithmeticCalculation a = new ArithmeticCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
				
					System.out.println("Please Enter two numbers for Division");
					x = sc.nextDouble();
					a.setA(x);
					System.out.println("First number " + a.getA());
					y = sc.nextDouble();
					a.setB(y);
					System.out.println("Second number " + a.getB());
					z = a.division(a.getA(), a.getB());
					a.setC(z);
					System.out.println("Result " + a.getC());
					System.out.println("To stop Addition calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}

	}

	// method for division
	public static void division() {
		double x;
		double y;
		double z;
		int out = 4;
		ArithmeticCalculation a = new ArithmeticCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter two numbers for Multiply");
					x = sc.nextDouble();
					a.setA(x);
					System.out.println("First number " + a.getA());
					y = sc.nextDouble();
					a.setB(y);
					System.out.println("Second number " + a.getB());
					z = a.multiply(a.getA(), a.getB());
					a.setC(z);
					System.out.println("Result " + a.getC());
					System.out.println("To stop Multiplication calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}

	}

	// method for exponent
	public static void exponent() {
		double x;
		double y;
		double z;
		int out = 4;
		ArithmeticCalculation a = new ArithmeticCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {

					System.out.println("Please Enter two numbers for Exponent");
					x = sc.nextDouble();
					a.setA(x);
					System.out.println("First number " + a.getA());
					y = sc.nextDouble();
					a.setB(y);
					System.out.println("Second number (power) " + a.getB());
					z = a.exponent(a.getA(), a.getB());
					a.setC(z);
					System.out.println("Result " + a.getC());
					System.out.println("To stop Exponent calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();
					// File file1 = new File("Calculation.txt");

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}

		}

	}

	// method for square root
	public static void squareRoot() {
		double x;
		double z;
		int out = 4;
		ArithmeticCalculation a = new ArithmeticCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers for to find Square Root");
					x = sc.nextDouble();
					a.setA(x);
					System.out.println("number " + a.getA());
					z = a.squareRoot(a.getA());
					a.setC(z);
					System.out.println("Result " + a.getC());
					System.out.println("To stop Square Root calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}

	}

	// method for nth root
	public static void nthRoot() {
		int out = 4;
		Scanner sc = new Scanner(System.in);
		ArithmeticCalculation a = new ArithmeticCalculation();
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Enter n(root) and x(number)");
					int n = sc.nextInt();
					a.setX(n);
					System.out.println("Value of n(root) is: " + a.getX());
					double x = sc.nextInt();
					a.setA(x);
					System.out.println("Value of x(number) is: " + a.getA());

					double root = a.nthroot(a.getX(), a.getA());
					a.setC(root);
					System.out.println("Root = " + a.getC());

					System.out.println("\nTo stop the nth Root calculation enter 10\nOr enter any other number");
					out = sc.nextInt();
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("Oops ! Something went wrong !\nPlease check your Input");
				break;
			}

		}

	}

	// method for Log calculation
	public static void logarithm() {
		double x;
		double z;
		int out = 4;
		ArithmeticCalculation a = new ArithmeticCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers for to find Log");
					x = sc.nextDouble();
					a.setA(x);
					System.out.println("number " + a.getA());
					z = a.log(a.getA());
					a.setC(z);
					System.out.println("Result " + a.getC());
					System.out.println("To stop Logarithm calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}

	}

	// method for natural log calculation
	public static void naturalLog() {
		double x;
		double z;
		int out = 4;
		ArithmeticCalculation a = new ArithmeticCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers for to find natural Log");
					x = sc.nextDouble();
					a.setA(x);
					System.out.println("number entered " + a.getA());
					z = a.log(a.getA());
					a.setC(z);
					System.out.println("Result " + a.getC());
					System.out
							.println("To stop Natural Logarithm calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}

	}

	// method for sin
	public static void sine() {
		double x;
		double z;
		int out = 4;
		TrigonometricCalculation trigo = new TrigonometricCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers for to find Sin");
					x = sc.nextDouble();
					trigo.setA(x);
					System.out.println("number entered " + trigo.getA());
					z = trigo.sine(trigo.getA());
					trigo.setC(z);
					System.out.println("Result " + trigo.getC());
					System.out.println("To stop Sine calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	// method for cosine
	public static void cosine() {
		double x;
		double z;
		int out = 4;
		TrigonometricCalculation trigo = new TrigonometricCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers for to find Cos");
					x = sc.nextDouble();
					trigo.setA(x);
					System.out.println("number entered " + 	trigo.getA());
					z = trigo.cosine(trigo.getA());
					trigo.setC(z);
					System.out.println("Result " + trigo.getC());
					System.out.println("To stop Cos calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	// method for tan
	public static void tan() {
		double x;
		double z;
		int out = 4;
		TrigonometricCalculation trigo = new TrigonometricCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers for to find Tan");
					x = sc.nextDouble();
					trigo.setA(x);
					System.out.println("number entered " + trigo.getA());
					z = trigo.tangent(trigo.getA());
					trigo.setC(z);
					System.out.println("Result " + trigo.getC());
					System.out.println("To stop Tan calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	// method for sin inverse
	public static void sinInverse() {
		double x;
		double z;
		int out = 4;
		TrigonometricCalculation trigo = new TrigonometricCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers for to find Sin Inverse");
					x = sc.nextDouble();
					trigo.setA(x);
					System.out.println("Number entered " + trigo.getA());
					z = trigo.sinInverse(trigo.getA());
					trigo.setC(z);
					System.out.println("Result " + trigo.getC());
					System.out.println("To stop Sin Inverse calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();

				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	// method for cos inverse
	public static void cosInverse() {
		double x;
		double z;
		int out = 4;
		TrigonometricCalculation trigo = new TrigonometricCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers for to find Cos Inverse");
					x = sc.nextDouble();
					trigo.setA(x);
					System.out.println("Number entered " + trigo.getA());
					z = trigo.cosInverse(trigo.getA());
					trigo.setC(z);
					System.out.println("Result " + trigo.getC());
					System.out.println("To stop Cos Inverse calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();
				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	// method for tan inverse
	public static void tanInverse() {
		double x;
		double z;
		int out = 4;
		TrigonometricCalculation trigo = new TrigonometricCalculation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers for to find Tan Inverse");
					x = sc.nextDouble();
					trigo.setA(x);
					System.out.println("Number entered " + trigo.getA());
					z = trigo.cosInverse(trigo.getA());
					trigo.setC(z);
					System.out.println("Result " + trigo.getC());
					System.out.println("To stop Tan Inverse calculation enter 10\nOr to continue enter any number");
					out = sc.nextInt();
				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	// method for Binary to Decimal Conversion
	public static void BinaryToDecimal() {
		String x;
		double z;
		int out = 4;
		NumberConversion convert = new NumberConversion();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers to perfrom Binary to Decimal Operation");
					x = sc.nextLine();
					convert.setString(x);
					System.out.println("Number entered " + convert.getString());
					z = convert.BinaryToDecimal(convert.getString());
					convert.setA(z);
					System.out.println("Result " + convert.getA());
					System.out.println("To stop the furhter Operation enter 10\nOr to continue enter any number");
					out = sc.nextInt();
				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	// method for decimal to binary
	public static void DecimalToBinary() {
		Integer x;
		String z;
		int out = 4;
		NumberConversion convert = new NumberConversion();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers to perfrom Decimal to Binary Operation");
					x = sc.nextInt();
					convert.setX(x);
					System.out.println("Number entered " + convert.getX());
					z = convert.DecimalToBinary(convert.getX());
					convert.setString(z);
					System.out.println("Result " + convert.getString());
					System.out.println("To stop the furhter Operation enter 10\nOr to continue enter any number");
					out = sc.nextInt();
				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	// method for SIP
	public static void systematicInvestmentPlan() {
		double x;
		double z;
		double investment;
		double annualRate;
		double years;

		int out = 4;
		SIP s = new SIP();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please enter Principal Amount");
					investment = sc.nextDouble();
					s.setInvestment(investment);
					System.out.println("Principal Amount: " + s.getInvestment());
					System.out.println("Please enter Annual Rate of interest %");
					annualRate = sc.nextDouble();
					s.setAnnualRate(annualRate);
					System.out.println("Annual Rate Entered: " + s.getAnnualRate());
					System.out.println("Montly rate is: " + (s.getAnnualRate() / 12 / 100));
					System.out.println("Please enter Year: ");
					years = sc.nextDouble();
					s.setYears(years);
					System.out.println("Year entered is: " + s.getYears());

					z = SIP.sip(s.getInvestment(), s.getAnnualRate(), s.getYears());
					s.setA(z);
					System.out.println("\n" + "SIP Result : " + s.getA());
					System.out.println("To stop the furhter Operation enter 10\nOr to continue enter any number");
					out = sc.nextInt();
				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	// method for storing in file
	public static void storingNumber() {
		Integer x;

		int out = 4;
		memoryStorage ms = new memoryStorage();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (out != 10) {
					System.out.println("Please Enter a numbers to store the it for later !");
					x = sc.nextInt();
					ms.setX(x);
					System.out.println("Number entered " + ms.getX());
					memoryStorage.writingToFile(ms.getX());
					System.out.println("To stop the furhter Operation enter 10\nOr to continue enter any number");
					out = sc.nextInt();
				} else {
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Something went wrong !\nPlease check your Input");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println(
					"Please select the operation category\n1. Arithmetic Calculation || 2. trigonometric Calculation || 3. Number Conversion || 4. Memory Storage || 5.Systematic Investment Plan (SIP) Calculator || 6. Exit");
			int category = sc.nextInt();
			if (category == 1) {
				
				while (true) {
					try {
						CalculationHistory.history();
					}
					catch(Exception e) {
						System.out.println("Oops ! Something went wrong");
					}
					System.out.println("Please select the operation you want to perform: \n1.Addition (+) "
							+ "2. Subtraction (-) 3. Division (/) 4. Multiplication (*) 5. Exponent (x^y) 6. Square Root 7. Nth Root \n8. logarithm (log)  9. natural Logarithm (nlog) 10. Exit");
					Integer choice = sc.nextInt();

					switch (choice) {
					
				
					case 1:
						addition();
						break;
					case 2:
						subtract();
						break;
					case 3:
						multiply();
						break;
					case 4:
						division();
						break;
					case 5:
						exponent();
						break;
					case 6:
						squareRoot();
						break;
					case 7:
						nthRoot();
						break;
					case 8:
						logarithm();
						break;
					case 9:
						naturalLog();
						break;

					}
					break;

				}

			} else if (category == 2) {
				while (true) {
					try {
						CalculationHistory.history();
					}
					catch(Exception e) {
						System.out.println("Oops ! Something went wrong");
					}
					System.out.println("Please select the operation you want to perform: \n1.Sine (Sin) "
							+ "2. Cosec (Cos) 3. Tangent (Tan) 4. Sine Inverse (sin-1(x)) 5. Cosec Inverse (cos-1(x)) 6. Tangent Inverse (tan-1(x)) 7. Exit");
					Integer choice = sc.nextInt();

					switch (choice) {
					case 1:
						sine();
						break;
					case 2:
						cosine();
						break;
					case 3:
						tan();
						break;
					case 4:
						sinInverse();
						break;
					case 5:
						cosInverse();
						break;
					}
					break;

				}

			} else if (category == 3) {
				while (true) {
					try {
						CalculationHistory.history();
					}
					catch(Exception e) {
						System.out.println("Oops ! Something went wrong");
					}
					System.out.println("Please select the operation you want to perform: \n1.Binary to Decimal "
							+ "2. Decimal to Binary 3. Exit");
					Integer choice = sc.nextInt();

					switch (choice) {
					case 1:
						BinaryToDecimal();
						break;
					case 2:
						DecimalToBinary();
						break;
					}
					break;

				}

			} else if (category == 4) {
				while (true) {
					try {
						CalculationHistory.history();
					}
					catch(Exception e) {
						System.out.println("Oops ! Something went wrong");
					}
					System.out.println("Please select the operation you want to perform: \n1.Storing number "
							+ "2. Retrieving Number 3. Exit");
					Integer choice = sc.nextInt();

					switch (choice) {
					case 1:
						storingNumber();
						break;
					case 2:

						memoryStorage.readingData();
						break;
					}
					break;

				}
			} else if (category == 5) {
				while (true) {
					try {
						CalculationHistory.history();
					}
					catch(Exception e) {
						System.out.println("Oops ! Something went wrong");
					}
					System.out.println(
							"Please select the operation you want to perform: \n1. Systematic Investment Planning (SIP)"
									+ " 2. Exit");
					Integer choice = sc.nextInt();

					switch (choice) {
					case 1:
						systematicInvestmentPlan();
						break;

					}
					break;

				}
			} else {
				System.out.println("Invalid input ! \nPlease try again");
			}
		}

	}
}
