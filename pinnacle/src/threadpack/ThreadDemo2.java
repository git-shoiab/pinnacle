package threadpack;
//https://fluvid.com/videos/detail/v_v8rS1YaZu4gEmo8#.Yhy5otm4S1Y.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {
	public ThreadDemo2() {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new MyRunnable2());
		es.shutdown();
	}
	public static void main(String[] args) {
		new ThreadDemo2();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
	
	class MyRunnable2 implements Runnable{

		@Override
		public void run() {
			System.out.println("child thread called...");
		}
		
	}
}
