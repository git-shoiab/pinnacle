package designpatterns;
//https://fluvid.com/videos/detail/AZX-wTByDOIm_X6vP#.Yhdw9TzqGFY.link
/*
 * STRATEGY PATTERN - TO ELIMINATE IF-ELSE-IF STATEMENTS
 * 
 * 1. CONVERT THE CONDITION TO CLASSES
 * 2. GROUP THEM UNDER A HIERARCHY
 * 3. CREATE A ASSOCIATION BETWEEN USING CLASS AND HEIRARCHIAL CLASS
 * 
 */
public class StrategyPattern {
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		brush.paint(new GreenPaint());
		Fan khaitan=new Fan();
		for(int i=0;i<10;i++) {
			khaitan.pull();
		}
	}
}



class PaintBrush{
	void paint(Paint paint) {
		paint.getColour();
	}
}

abstract class Paint{
	public abstract void getColour();
}
class RedPaint extends Paint{
	@Override
	public void getColour() {
		System.out.println("red colour....");
	}
}
class BluePaint extends Paint{
	@Override
	public void getColour() {
		System.out.println("blue colour....");
	}
}
class GreenPaint extends Paint{
	@Override
	public void getColour() {
		System.out.println("green colour....");
	}
}

class Dogi{
	public void play(String item) {
		if(item.equals("stick")) {
			
		}
		else if(item.equals("stone")) {
			
		}
	}
}

class Fan{
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}

abstract class State{
	abstract void pull(Fan fan);
}
class SwitchOffState extends State{
	@Override
	void pull(Fan fan) {
		fan.state=new SwitchOnState();
		System.out.println("switch on state......");
	}
}
class SwitchOnState extends State{
	@Override
	void pull(Fan fan) {
		fan.state=new LowSpeedState();
		System.out.println("low speed state......");
	}
}
class LowSpeedState extends State{
	@Override
	void pull(Fan fan) {
		fan.state=new MediumSpeedState();
		System.out.println("medium speed state......");
	}
}
class MediumSpeedState extends State{
	@Override
	void pull(Fan fan) {
		fan.state=new HighSpeedState();
		System.out.println("high speed state......");
	}
}
class HighSpeedState extends State{
	@Override
	void pull(Fan fan) {
		fan.state=new SwitchOffState();
		System.out.println("switch off state......");
	}
}