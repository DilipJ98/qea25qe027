package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "BMW");
		map.put(2, "Benz");
		
		for (Integer i : map.keySet()) {
			System.out.println(i);
		}
	}
}
