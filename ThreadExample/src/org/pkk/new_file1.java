package org.pkk;

//How to set the priority of a thread?

public class new_file1 {
	   public static void main(String[] args) throws Exception {
	      Thread thread1 = new Thread();
	      Thread thread2 = new Thread();
	      thread1.setPriority(Thread.MAX_PRIORITY);
	      thread2.setPriority(Thread.MIN_PRIORITY);
	      thread1.start();
	      thread2.start();
	      thread1.join();
	      thread2.join();
	      System.out.println("The priority has been set.");
	   }
	}