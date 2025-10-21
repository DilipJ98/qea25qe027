package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args) throws IOException {
		
		FileWriter write = new FileWriter("C:\\Users\\Dilip\\Desktop\\Ecommerce.txt");
		String sample = "Java";
		write.write(sample);
		write.close();
	
		FileReader read = new FileReader("C:\\Users\\Dilip\\Desktop\\Ecommerce.txt");
		int value;
//		
		while ((value = read.read()) != -1) {
			System.out.print((char) value);
		}
		read.close();
		
	}
}
