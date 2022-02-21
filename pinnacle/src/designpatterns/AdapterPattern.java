package designpatterns;
//Adapter pattern - https://fluvid.com/videos/detail/oKxdEh64peuD4zqgD#.YgTwnQAz4FE.link
public class AdapterPattern {
	public static void main(String[] args) {
		RoundPinPlug shakthi=new BharatPlug();
		
		RoundPinHoleSocket bijli=new BharatSocket();
		
		bijli.roundPinHole(shakthi);
		
		SlabPinPlug anchor=new AmericanPlug();
		
		//bijli.roundPinHole(anchor);		
		
		bijli.roundPinHole(new IndianAdapter(anchor));
	}
}

class IndianAdapter extends RoundPinPlug{
	SlabPinPlug spp;
	public IndianAdapter(SlabPinPlug spp) {
		this.spp=spp;
	}
	@Override
	public void execute() {
		spp.execute();		
	}
}
//INDIAN GOVERNMENT STANDARDS FOR PLUGS AND SOCKETS
abstract class RoundPinPlug{
	public abstract void execute();
}
abstract class RoundPinHoleSocket{
	public abstract void roundPinHole(RoundPinPlug rpp);
}

//AMERICAN GOVERNMENT STANDARDS FOR PLUGS AND SOCKETS

abstract class SlabPinPlug{
	public abstract void execute();
}
abstract class SlabPinHoleSocket{
	public abstract void slabPinHole(SlabPinPlug spp);
}

//Indian Companies

class BharatPlug extends RoundPinPlug{
	@Override
	public void execute() {
		System.out.println("round pin bharat plug works....");
	}
}
class BharatSocket extends RoundPinHoleSocket{
	@Override
	public void roundPinHole(RoundPinPlug rpp) {
		rpp.execute();
	}
}

class AmericanPlug extends SlabPinPlug{
	@Override
	public void execute() {
		System.out.println("slab pin american plug works......................");
	}
}
