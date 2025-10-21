package multi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
	public static void main(String[] args) {
//		List<List<String>> names = Arrays.asList(Arrays.asList("Dileep"), Arrays.asList("Naresh"), Arrays.asList("Apsar"));
		
		List<Integer> nums = Arrays.asList(10,1,5,20,22);
		
//		names.stream().filter(s -> s.contains("e")).forEach(s -> System.out.println(s));
		
//		List<String> flatNames = names.stream().flatMap(m -> m.stream()).collect(Collectors.toList());
//		System.out.println(flatNames);

		nums.stream().sorted().forEach(System.out::println);;
		
		
	}
}
