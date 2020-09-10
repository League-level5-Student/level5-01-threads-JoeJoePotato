package _03_Threaded_Greeting;

public class ThreadGreeter implements Runnable{
int i;
	public ThreadGreeter(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("THIS IS THREAD NUMBER "+i+" ALL HAIL TEH MEME-LORDS");
		if(i<50) {
			Thread t = new Thread(new ThreadGreeter(i+1));
			t.run();
		}
	}

}
