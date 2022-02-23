package designpatterns;
//https://fluvid.com/videos/detail/e-KdETVAa4U5dapq-#.YhYYsHdkqCY.link
public class DecoratorPattern {
	public static void main(String[] args) {
		Tea myTea=new DarjilingTea(new Milk(new Samahan()));
		
		System.out.println("Tea cost...:"+myTea.cost());
	}
}

abstract class Tea{
	public abstract int cost();
}

abstract class Dicashion extends Tea{}
abstract class Ingredients extends Tea{}

class AssamTea extends Dicashion{
	Tea tea;
	public AssamTea() {
		// TODO Auto-generated constructor stub
	}
	public AssamTea(Tea tea) {
		this.tea=tea;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(tea==null) {
			return 5;
		}
		else {
			return tea.cost()+5;
		}
	}
}

class DarjilingTea extends Dicashion{
	Tea tea;
	public DarjilingTea() {
		// TODO Auto-generated constructor stub
	}
	public DarjilingTea(Tea tea) {
		this.tea=tea;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(tea==null) {
			return 10;
		}
		else {
			return tea.cost()+10;
		}
	}
}

class Samahan extends Ingredients{
	Tea tea;
	public Samahan() {
		// TODO Auto-generated constructor stub
	}
	public Samahan(Tea tea) {
		this.tea=tea;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(tea==null) {
			return 10;
		}
		else {
			return tea.cost()+10;
		}
	}
}
class Milk extends Ingredients{
	Tea tea;
	public Milk() {
		// TODO Auto-generated constructor stub
	}
	public Milk(Tea tea) {
		this.tea=tea;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(tea==null) {
			return 5;
		}
		else {
			return tea.cost()+5;
		}
	}
}
