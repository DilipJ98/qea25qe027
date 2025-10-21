package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ReadJSON {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader input = new FileReader("C:/Users/Dilip/Desktop/sample.json");
		Gson gson = new Gson();
//		TestData data = gson.fromJson(input, TestData.class);
//		System.out.println(data.name);
//		
//		System.out.println(data.skills.size());
		
		
//		JsonObject obj = gson.fromJson(input, JsonObject.class);
//		JsonArray arr = obj.getAsJsonArray("skills");
//		for (JsonElement ele : arr) {
//			JsonObject obj2 = ele.getAsJsonObject();		
//			System.out.println(obj2.get("program"));
//			System.out.println(obj2.get("level"));
//		}
		
		Map<String, Object> data = gson.fromJson(input, Map.class);
		List<Map<String, String>> dataList = (List<Map<String, String>>) data.get("skills");
		
		for (Map<String, String> maps : dataList) {
			System.out.println(maps.get("program"));
			System.out.println(maps.get("level"));
		}
	}
}


