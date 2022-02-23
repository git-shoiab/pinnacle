package designpatterns;
//https://fluvid.com/videos/detail/G6x-YcDKddc5gRryA#.YhYhhfRCxus.link
public class CommandPattern {
	public static void main(String[] args) {
		Tv tv=new Tv();
		SetTopBox stBox=new SetTopBox();
		VGame vgame=new VGame();
		MusicSystem ms=new MusicSystem();
		
		Command newsCommand=new PlayNewsChannelCommand(tv, stBox, vgame, ms);
		Command serialCommand=new ViewSerialCommand(tv, stBox, vgame, ms);
		Command playCommand=new PlayVgameCommand(tv, stBox, vgame, ms);
		
		Genie genie=new Genie();
		genie.setCommand(playCommand, 0);
		genie.setCommand(serialCommand, 1);
		genie.setCommand(newsCommand, 2);
		
		genie.executeCommand(1);
	}
}

class Genie{
	Command c[]=new Command[5];
	public Genie() {
		for(int i=0;i<c.length;i++) {
			c[i]=new DummyCommand();
		}
	}
	public void executeCommand(int slot) {
		c[slot].execute();
	}
	public void setCommand(Command c,int slot) {
		this.c[slot]=c;
	}
}
abstract class Command{
	public abstract void execute();
}

class DummyCommand extends Command{
	@Override
	public void execute() {
		System.out.println("I am dummy yet to be operational...");
	}
}

class PlayNewsChannelCommand extends Command{
	Tv tv;SetTopBox stBox;VGame vgame;MusicSystem ms;
	public PlayNewsChannelCommand(Tv tv,SetTopBox stBox,VGame vgame,MusicSystem ms) {
		this.tv=tv;
		this.stBox=stBox;
		this.vgame=vgame;
		this.ms=ms;
	}
	@Override
	public void execute() {
		System.out.println("fathers request of playing news channel accepted...");
		tv.av1();
		stBox.newsChannel();
		ms.highSound();
		System.out.println("Enjoy the news channel father....");
	}
}
class PlayVgameCommand extends Command{
	Tv tv;SetTopBox stBox;VGame vgame;MusicSystem ms;
	public PlayVgameCommand(Tv tv,SetTopBox stBox,VGame vgame,MusicSystem ms) {
		this.tv=tv;
		this.stBox=stBox;
		this.vgame=vgame;
		this.ms=ms;
	}
	@Override
	public void execute() {
		System.out.println("fathers request of playing tt accepted...");
		tv.av2();
		vgame.tableTennis();
		ms.highSound();
		System.out.println("Enjoy the news channel father....");
		
	}
}
class ViewSerialCommand extends Command{
	Tv tv;SetTopBox stBox;VGame vgame;MusicSystem ms;
	public ViewSerialCommand(Tv tv,SetTopBox stBox,VGame vgame,MusicSystem ms) {
		this.tv=tv;
		this.stBox=stBox;
		this.vgame=vgame;
		this.ms=ms;
	}
	@Override
	public void execute() {
		System.out.println("mothers request of playing serial accepted...");
		tv.av1();
		stBox.serialChannel();
		ms.lowSound();
		System.out.println("Enjoy the serial channel mother....");
		
	}
}
class Tv{
	public void av1() {
		System.out.println("av1 mode....");
	}
	public void av2() {
		System.out.println("av2 mode.....");
	}
}

class SetTopBox{
	public void newsChannel() {
		System.out.println("news channel started....");
	}
	public void serialChannel() {
		System.out.println("serial channel started....");
	}
}

class VGame{
	public void tableTennis() {
		System.out.println("tt game started...");
	}
}

class MusicSystem{
	public void lowSound() {
		System.out.println("low sound.........");
	}
	public void highSound() {
		System.out.println("high sound........");
	}
}