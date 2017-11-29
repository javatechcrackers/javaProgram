package CountDownLatchExample;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable {
	private final CountDownLatch lat;
	private final String[] items;
	

	public FoodProcessor(CountDownLatch latch, String[] arr) {
		this.items=arr;
		this.lat=latch;
	}
	

	public void run() {
		for(int i=0; i< items.length ; i++){
			try{
				
				System.out.println("Before processing " + lat.getCount());
				Thread.sleep(10000);
				System.out.println("Item prepared " + items[i]);
				lat.countDown();
				System.out.println("After processing " + lat.getCount());
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}

}
