package files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileClass {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Dilip\\Desktop\\QE27\\sample.txt");
		File filTwo = new File("C:\\Users\\Dilip\\Desktop\\QE27\\sampleTwo.txt");
		filTwo.createNewFile();
		System.out.println(file.getAbsolutePath());
//		FileUtils.writeStringToFile(file, "QEA2725", "UTF-8");
		String str = FileUtils.readFileToString(file, "UTF-8");
		FileUtils.copyFile(file, filTwo);
	}
}
