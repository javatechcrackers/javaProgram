package CountDownLatchExample;

import java.util.concurrent.CyclicBarrier;

public class CabBooking {

	

	public static void main(String[] args) throws InterruptedException {
		
		CyclicBarrier barrier = new CyclicBarrier(3);
		Thread t1 = new Thread(new CabService(barrier));
		t1.setName("Passenger 1");
		t1.start();
		Thread.sleep(5000);

		Thread t2 = new Thread(new CabService(barrier));
		t2.setName("Passenger 2");
		t2.start();
		Thread.sleep(5000);
		
		Thread t3 = new Thread(new CabService(barrier));
		t3.setName("Passenger 3");
		t3.start();
		Thread.sleep(5000);
		
	}

}
