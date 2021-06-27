package calculationPrj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;

public class memoryStorage extends Calculation{

	public static FileOutputStream storeNumber() {
		FileOutputStream fos = null;
		String filePath = "storage.txt";
		try {
			fos = new FileOutputStream(filePath);

		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		return fos;

	}

	public static void writingToFile(int z) {
		try {
			storeNumber().write(z);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	public static void readingData() {
		String filePath = "storage.txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e1) {
		
			e1.printStackTrace();
		}

		int st;
		try {
			st = br.read();
				System.out.println("The retrieved number is: "+st);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
