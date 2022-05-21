package ch6to10;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		calc.add1(10, 20);
		int result=calc.add2(100,20);
		
		System.out.println(result);
		
		calc.add3(10,20);
		
		calc.add4(10,20,100,300,10);
		
		calc.add5(new int[] {10,20,30,40});
	}
}
