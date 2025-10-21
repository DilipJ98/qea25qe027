package multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadEx {
	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		BuildWalls walls = new BuildWalls();
		BuildRoof roof = new BuildRoof();		
		
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		threadPool.submit(walls);
		threadPool.submit(roof);
		
		threadPool.shutdown();
		
		threadPool.awaitTermination(1, TimeUnit.MINUTES); 
		
		System.out.println(System.currentTimeMillis() - startTime + " this is whole execution time");
	}
}


class BuildWalls implements Runnable {
	public void buildWall() {
		try {
			Thread.sleep(5000);
			System.out.println("build wall method " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void run() {
		buildWall();
	}
}

class BuildRoof implements Runnable{
	public void buildRoof() {
		try {
			Thread.sleep(3000);
			System.out.println("build roof method: " + Thread.currentThread().getName());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		buildRoof();
	}
}

