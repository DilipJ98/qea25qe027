package collections;

import java.util.Comparator;

public class SortByNames implements Comparator<Employees>{
	public int compare(Employees one, Employees two) {
		return one.employeName.compareTo(two.employeName);
	}
}
