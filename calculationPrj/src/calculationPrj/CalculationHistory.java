package calculationPrj;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;




public class CalculationHistory extends PrintStream{
	private final PrintStream second;

    public CalculationHistory(OutputStream main, PrintStream second) {
        super(main);
        this.second = second;
    }


    public void close() {
        // just for documentation
        super.close();
    }


    public void flush() {
        super.flush();
        second.flush();
    }


    public void write(byte[] buf, int off, int len) {
        super.write(buf, off, len);
        second.write(buf, off, len);
    }


    public void write(int b) {
        super.write(b);
        second.write(b);
    }


    public void write(byte[] b) throws IOException {
        super.write(b);
        second.write(b);
    }
    
    public static void history() throws FileNotFoundException {
    	 FileOutputStream file = new FileOutputStream("CalculationHistory.txt");
    	 CalculationHistory ch = new CalculationHistory(file, System.out);
    	    System.setOut(ch);
    }
	
}