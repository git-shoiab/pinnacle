package utilpack;
//https://fluvid.com/videos/detail/gk_qEcgo4Gi96o171#.Yl6YS4xTZ_M.link
import java.util.Vector;

public class ColDemo5 {
	public static void main(String[] args) {
		 Vector<Test> v=new Vector<>();
		// v.add("hello");
		 v.add(new Test());
		 
		 for(int i=0;i<v.size();i++) {
			 Test str=(Test)v.get(i);
		 }
	}
}


class Test{}