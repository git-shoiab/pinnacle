package genannorev;
//https://fluvid.com/videos/detail/gk_qEcgo4Gi96o171#.Yl6YS4xTZ_M.link
public class GenAnnoRevision {
	public static void main(String[] args) {
		GenDemo2 obj=new GenDemo2();
		obj.obj=new Tool();
		obj.business();
		
		CorrectDemo<Stool> cd=new CorrectDemo<>();
		cd.setObj(new Stool());
		
		Stool st=cd.getObj();
		st.mymet();
	}
}


class GenDemo{
	Tool obj;
	public void business() {
		obj.met();
	}
}
class GenDemo2{
	Object obj;
	public void business() {
		if(obj instanceof Tool) {
			Tool tool=(Tool)obj;
			tool.met();
		}
		else if(obj instanceof Stool) {
			Stool stool=(Stool)obj;
			stool.mymet();
		}
	}
}

class CorrectDemo<T>{
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
class Tool{
	public void met() {
		System.out.println("met called...");
	}
}

class Stool{
	public void mymet() {
		System.out.println("my met of stool called...");
	}
}