package doubts2;
//https://fluvid.com/videos/detail/Y5V24T89RVF9LOMom#.YfvBTHp47ao.link
public class GarbageDemo {
	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		System.out.println("Before NewsPaper Creation..:"+rt.freeMemory());
		NewsPaper express=new NewsPaper();
		System.out.println("After NewsPaper Creation..:"+rt.freeMemory());
		
		express=null;
		
		System.out.println(express);
		
		System.out.println("After NewsPaper is null..:"+rt.freeMemory());
		
		rt.gc();
		
		System.out.println("After NewsPaper is null..:"+rt.freeMemory());
	}
}


class NewsPaper{
	String str[];
	public NewsPaper() {
		str=new String[100000];
		for(int i=0;i<str.length;i++) {
			str[i]=new String("..."+i);
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize of news paper object called....");
	}
}