package threadpack;
//https://fluvid.com/videos/detail/xLOkKc_mxnS1rn-q6#.YiCgEmtsrZg.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7 {
	public static void main(String[] args) {
		Gun bofors=new Gun();
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(new Runnable() {			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					bofors.fill();
				}
			}
		});
		es.execute(new Runnable() {			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					bofors.fire();
				}
			}
		});
		es.shutdown();
	}
}
//inter thread communication
class Gun{
	boolean flag;
	synchronized public void fill() {
		if(flag) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("fill the gun.....");
		flag=true;
		notify();
	}
	
	synchronized public void fire() {
		if(!flag) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("shoot the gun.....");
		flag=false;
		notify();
	}
}