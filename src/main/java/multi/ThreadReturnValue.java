package multi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadReturnValue  {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ReturnSomething r = new ReturnSomething();
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		Future<Integer> future =  threadPool.submit(r);
		System.out.println("The main Thread execution continue");
		System.out.println(future + " this is future obj");
		System.out.println(future.get());
	}
	
}

class ReturnSomething implements Callable<Integer> {
	public Integer call() {
		try {
			Thread.sleep(5000);
			return 100;
		} catch (Exception e) {
			// TODO: handle exception
			return 500;
		}
	}	
	
	
}
