package threadpack;
//https://fluvid.com/videos/detail/ODe_5Cmk2pup1xrn-#.YiCjmlMONjw.link
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo8 {
	public static void main(String[] args)throws Exception {
		ExecutorService es=Executors.newFixedThreadPool(1);
		
		Future obj= es.submit(new ThreadJob());
		
		Object value=obj.get();
		
		
		System.out.println(value);
		
		es.shutdown();
	}
}

class ThreadJob implements Callable{
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return "returned by the call method of thread job....";
	}
}

