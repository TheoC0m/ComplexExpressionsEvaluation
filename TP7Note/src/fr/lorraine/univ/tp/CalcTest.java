package fr.lorraine.univ.tp;

public class CalcTest {

	public CalcTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		/*System.out.println("9+9*3-8(-9)".matches(".*\\d+(\\.\\d+)?\\(+.*"));
		System.out.println("-1 : " + calc.Solve("(-1)"));
		System.out.println("1 : " + calc.Solve("-(-1)"));
		System.out.println("1 : " + calc.Solve("(-(-1))"));
		System.out.println("18 : " + calc.Solve("10+8"));
		System.out.println("20 : " + calc.Solve("   10  +8 +     2"));
		System.out.println("-40 : " + calc.Solve(" (  10  +8 +     2 )  *  ( - 2  )"));
		System.out.println("30 : "+calc.Solve("10+8+2+5+5"));
		System.out.println("15 : "+calc.Solve("(10+8+2+5+5)/2"));
		System.out.println("-15 : "+calc.Solve("((10+8+2+5+5)/2)*(-1)"));
		System.out.println("-15 : "+calc.Solve("((10+8+2+5+5)/2)*(-1)"));
		System.out.println("5 : "+calc.Solve("(((((10+8+2+5+5)/2)*(-1))+(10*2))+5)/2"));
		System.out.println("0 : "+calc.Solve("((((((10+8+2+5+5)/2)*(-1))+(10*2))+5)/2)+(-5)"));
		//System.out.println("error : "+calc.Solve("5/(((((((10+8+2+5+5)/2)*(-1))+(10*2))+5)/2)+(-5))"));
		System.out.println("error : " + calc.Solve("(5+5)+7-(1)9"));*/
		System.out.println("err : " + calc.Solve("4+(-(-8))*7"));
	
	}

}
