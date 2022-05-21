package anoundtech;

public class Programming2 {
	public static void main(String[] args) {
		String month="nov";
		
		switch(month) {
		case "january":{
			System.out.println("this is pongalo pongal.....");
			break;
		}
		case "february":{
			System.out.println("velentine............");
			break;
		}
		case "march":{
			System.out.println("padi padi exams....");
			break;
		}
		case "april":{
			System.out.println("april mayile......");
			break;
		}
		default:{
			System.out.println("enna panrathu.............");
			break;
		}
		case "may":{
			System.out.println("hot hoter hotest...");
		}
		}
		
		int day=1;
		switch(day) {
		case 1:{
			System.out.println("sunday...");
			break;
		}
		case 2:{
			System.out.println("monday..");
			break;
		}
		}
		
		char c='a';
		switch(c) {
		case 'a':{
			System.out.println("apple...");
			break;
		}
		case 'b':{
			System.out.println("bat");
			break;
		}
		default:{
			System.out.println("hi hi");
		}
		}
	}
}
