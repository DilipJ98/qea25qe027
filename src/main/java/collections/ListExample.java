package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(20);
		list.add(300);
		list.add(null);
		list.add(null);
		list.set(1, 50);

		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}



//int -> Integer
//boolean -> Boolean
//float -> Float
