package fr.lorraine.univ.tp;

public class CalcTest {

	public CalcTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println("18 : " + calc.Solve("10+8"));
		
		System.out.println("30 : "+calc.Solve("10+8+2+5+5"));

		System.out.println("15 : "+calc.Solve("(10+8+2+5+5)/2"));
		
		System.out.println("-15 : "+calc.Solve("((10+8+2+5+5)/2)*(-1)"));
		
		System.out.println("-15 : "+calc.Solve("((10+8+2+5+5)/2)*(-1)"));
	}

}
