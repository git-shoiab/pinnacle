package anoundtech;
//https://fluvid.com/videos/detail/xLOkKcLLM5sn27OeR#.YnozskQPqz8.link
public class WrapperDemo {
	
	public static void main(String[] args) {
		int i=10;
		Integer ii=10;
		
		Integer in=new Integer(10);
		in=Integer.valueOf(10);
		in=Integer.parseInt("10");
		
		i=in;//auto unboxing
		i=Integer.valueOf(ii);//manual unboxing
		
		in=i;//auto boxing
		
		String arg1=args[3];
		String arg2=args[2];
		
		System.out.println(arg1+arg2);
		System.out.println(Integer.parseInt(arg1)+Integer.parseInt(arg2));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.compare(20, 10));
		
		System.out.println(Integer.max(20, 40));
	}
	
	
}
