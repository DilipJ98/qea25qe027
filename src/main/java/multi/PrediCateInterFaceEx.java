package multi;

import java.util.function.Predicate;

public class PrediCateInterFaceEx  {
	public static void main(String[] args) {
		Runnable rn = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		
		Thread th = new Thread(rn);
		th.start();
	}
}

//[[[]]] -> []

// stream()
// Intermediate op --> filetr(), map(), flatmap(), distinc()
//Terminal op --> forEach(), Collect(),
