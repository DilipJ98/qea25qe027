package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx {
	public static void main(String[] args) {
		try {
		FileInputStream input = new FileInputStream("C:\\Users\\Dilip\\Desktop\\slide-12.png");
		FileOutputStream ouput = new FileOutputStream("C:\\Users\\Dilip\\Desktop\\recreated.png");
		
		int byteNum;
		while((byteNum = input.read()) != -1) {
			ouput.write(byteNum);
		}
		
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
