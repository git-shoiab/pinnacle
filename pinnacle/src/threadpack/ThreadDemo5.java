package threadpack;
//https://fluvid.com/videos/detail/9wa-Bi725qFR9Rp1Z#.Yh9UJ55tFKk.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo5 {
	public static void main(String[] args) {
		TrainingRoom t1=new TrainingRoom();
		TrainingRoom t2=new TrainingRoom();
		
		System.out.println(t1.sanyo+":"+t2.sanyo);
		System.out.println(t1.toilet+":"+t2.toilet);
		
		ExecutorService es=Executors.newFixedThreadPool(2);
//		es.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				Thread.currentThread().setName("ram");
//				System.out.println("Ram...:"+t1.sanyo);
//				t1.sanyo.useProjector();
//			}
//		});
//		
//		es.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				Thread.currentThread().setName("rahim");
//				System.out.println("Rahim..:"+t2.sanyo);
//				t2.sanyo.useProjector();
//			}
//		});
es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("ram");
			//	System.out.println("Ram...:"+t1.toilet);
//				synchronized(TrainingRoom.toilet) {
				synchronized(Toilet.class) {
					TrainingRoom.toilet.useToilet();;
				}
			}
		});
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("rahim");
			//	System.out.println("Rahim..:"+t2.toilet);
//				synchronized(t1.toilet) { - Not recommended
//				synchronized(TrainingRoom.toilet) {//object lock
				synchronized(Toilet.class) {//class lock - this works only static
					TrainingRoom.toilet.useToilet();
				}
			}
		});
		es.shutdown();
	}
}

class TrainingRoom{
	Projector sanyo=new Projector();
	static Toilet toilet=new Toilet();
}

class Projector{
	public Projector() {
		System.out.println("projector object created...");
	}
	public void useProjector() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the projector..."+this);
		try {Thread.sleep(10000);}catch(Exception e) {		}
		System.out.println(name+" has completed the use of projector..."+this);
	}
}

class Toilet{
	public Toilet() {
		System.out.println("toilet object created....");
	}
	public void useToilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the toilet..."+this);
		try {Thread.sleep(10000);}catch(Exception e) {		}
		System.out.println(name+" has completed the use of toilet..."+this);
	}
}