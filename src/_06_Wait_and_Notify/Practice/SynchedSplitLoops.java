package _06_Wait_and_Notify.Practice;

/*
 
Below are two threads. One thread increments the counter
and the other thread prints the result. If you run the
program as it is, you'll notice that the output in not
sequential.

Your goal is to modify the code inside the threads so that 
they are in synch. Use synchronized, wait, and notify to make
it so that t1 will only increase counter after t2 has printed 
the previous result. The output should be the numbers 0 to 100000
printed in order.
  
*/

public class SynchedSplitLoops implements Runnable{
	static Object threadLock = new Object();
	static int totalThreads = 0;
	private static int thread;

	public static void main(String[] args) {
		SynchedSplitLoops s=new SynchedSplitLoops();
		s.run();
		for (int i = 0; i < 10000; i++) {
			totalThreads++;
		}
	}
	
	private static void setthread(int totalThreads2) {
		// TODO Auto-generated method stub
		thread=totalThreads2;
	}

	public void run() {
		synchronized(threadLock) { 
			setthread(totalThreads);
			threadLock.notify(); 
			try {
				threadLock.wait(); 
			} catch (InterruptedException e) {
				System.out.println("error!");
			}
			
			System.out.println(thread);
			threadLock.notify(); 
			try {
				threadLock.wait(); 
			} catch (InterruptedException e) {
				System.out.println("error!");
			}
		}}}
