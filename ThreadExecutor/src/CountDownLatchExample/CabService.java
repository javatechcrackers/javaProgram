package CountDownLatchExample;

import java.util.concurrent.CyclicBarrier;

public class CabService implements Runnable {

	CyclicBarrier barrier;
	
	public CabService(CyclicBarrier barrier){
		this.barrier = barrier;
	}
	
	
	public void run() {
		try{
			System.out.println("++++" + Thread.currentThread().getName()+ " Has arrived");
			try{
				barrier.await();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("++++" + Thread.currentThread().getName()+ " going to board cab");
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
