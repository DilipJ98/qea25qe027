package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderClass {
	public static void main(String[] args) throws IOException {
		FileReader fReader = new FileReader("C:\\Users\\Dilip\\Desktop\\Ecommerce website - login feature,.txt");
		BufferedReader reader = new BufferedReader(fReader);
		
		FileWriter fWriter = new FileWriter("C:\\Users\\Dilip\\Desktop\\Ecommerce website - logout feature,.txt", true);
		BufferedWriter writer = new BufferedWriter(fWriter);
		String fileData;
		while ((fileData = reader.readLine()) != null) {
			writer.newLine();
			writer.write(fileData);
		}	

		
//		fReader.close();
//		reader.close();
//		fWriter.close();
//		writer.close();
	}
}
