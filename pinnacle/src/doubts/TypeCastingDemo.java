package doubts;

public class TypeCastingDemo {
	public static void main(String[] args) {
		//NUMBER TYPES
		//Long,int,short,byte
		
		byte b=100;//8 bit
		short s=b;//16 bit
		int i=s;//32 bit
		long l=i;//64 bit
		
		//POINT 1
		//b=s;//you cannot store a highter data type into a lower datatype
		//To overcome this, you need to do casting
		
		b=(byte)s;//by using this syntax, we can convert short to byte i.e 16 bit to 8 bit
		
		//The same way we can convert any higher type into lower type
		
		//POINT 2
		//What happens when casting is done
		int num=257;
		byte numb=(byte)num;
		//The num value when it is casted with byte, then it will be divided by 256 and reminder will be stored in the left hand side variable
		
		//i.e - the value of numb will be 1
		
		System.out.println(numb);
		//So when you do a downcasting, you actually loose the precision of data..
		
		//CHARACTER TYPE
		int cnum=97;
		char c=(char)cnum;//this will store the cnum as character in c (All numbers are not characters)
		//but the reverse is possible
		
		int temp=c;//this is possible becuase - all characters are by default numbers
		
		//FLOATING TYPE
		
		int fnum=100;
		float ff=fnum;// a number type can be given to a float
		int fnumm=(int)ff;//a float cannot be assigned to a number though both are 32 bit
		ff=1020.222f;
		fnum=(int)ff;//by casting a float value to a int type, we loose the precision..
		System.out.println(fnum);
		
		
		
	}
}
