package multi;

public class UseRunnableInterface implements Runnable{
	public void run() {
		threadMethod();
	}
	
	public void threadMethod() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) throws InterruptedException {
		UseRunnableInterface obj = new UseRunnableInterface();
		Thread tOne = new Thread(obj);
		Thread tTwo = new Thread(obj);
		
		tOne.start();
		tTwo.start();
	}
}


//start - to start your thread execution
//run -> this is where your thread starts execution
//join -> tells main method to wait for the other threads execution