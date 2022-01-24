package pinnacle;

public class ConditionsDemo2 {
	public static void main(String[] args) {
		int month=2;
		
		switch(month) {
		case 1:{
			System.out.println("January.... ");
			break;
		}
		case 2:{
			System.out.println("February...");
			break;
		}
		default:{
			System.out.println("Dont know which month...");
		}
		}
		
		char c='a';
		
		switch(c) {
		case 'a':{
			System.out.println("apple.... ");
			break;
		}
		case 'b':{
			System.out.println("bat...");
			break;
		}
		default:{
			System.out.println("Dont know which alphabet...");
		}
		}
		
		String str="january";
		switch(str) {
		default:{
			System.out.println("Dont know which month...");
			break;
		}
		case "january":{
			System.out.println("1st month.... ");
			break;
		}
		case "february":{
			System.out.println("2nd month...");
			break;
		}
	
	}
	}
}
