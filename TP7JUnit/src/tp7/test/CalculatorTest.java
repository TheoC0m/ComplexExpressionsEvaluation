package tp7.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import fr.lorraine.univ.tp.Calculator;

public class CalculatorTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	Calculator calc = new Calculator();
	
	/*
	 * Tests de calculs
	 */

	@Test
	public void test1() {
		assertEquals(1, calc.Solve("1"), 0);
	}

	@Test
	public void test2() {
		assertEquals(2, calc.Solve("(2)"), 0);
	}

	@Test
	public void test3() {
		assertEquals(-3, calc.Solve("(-3)"), 0);
	}

	@Test
	public void test4() {
		assertEquals(4, calc.Solve("-(-4)"), 0);
	}

	@Test
	public void test5() {
		assertEquals(5, calc.Solve("+(+5)"), 0);
	}

	@Test
	public void test6() {
		assertEquals(9, calc.Solve("4+5"), 0);
	}

	@Test
	public void test7() {
		assertEquals(20, calc.Solve("8+2+10"), 0);
	}

	@Test
	public void test8() {
		assertEquals(4, calc.Solve("20/5"), 0);
	}

	@Test
	public void test9() {
		assertEquals(12, calc.Solve("3*4"), 0);
	}

	@Test public void test10() { 
		assertEquals(14, calc.Solve("(3*4)+2"), 0);
	}
	
	@Test public void test11() { 
		  assertEquals(7, calc.Solve("((3*4)+2)/2"), 0);
		}

	@Test public void test12() { 
		  assertEquals(5, calc.Solve("(((3*4)+2)/2)-2"), 0);
		}
	
	@Test public void test13() { 
		  assertEquals(-5, calc.Solve("((((3*4)+2)/2)-2)*(-1)"), 0);
		}
	
	@Test public void test14() { 
		  assertEquals(-1.384615385, calc.Solve("8/(9+4)-2"), 0.1); 
		  }
	
	 @Test public void test15() { 
		  assertEquals(33, calc.Solve("(2+4)*7-9"), 0); 
		  }
	 
	 @Test public void test16() { 
		  assertEquals(20, calc.Solve("(((4+6)*2-5+5*(3))+10)/2"), 0); 
		  }
	 
	  @Test public void test17() { 
		  assertEquals(182.5, calc.Solve("( (-7) + ( 1+ (-8) * (-9) * (-5) ) + 1) / (-2)"), 0); 
		  }
	 
	 @Test public void test18() { 
		  assertEquals(199.5, calc.Solve("(( (-7) + ( 1+ (-8) * (-9) * (-5) ) + 1) / (-2))+1 - ((2))*(((-8)))"), 0); 
		  }
	 
	 @Test public void test19() { 
		  assertEquals(76.22222, calc.Solve("((((((43+3+4)*2)/4)*(1+1))/(-2))+5*4+5)+6*8-7/9+4*8-3"), 0.1); 
		  }
	 
	 @Test public void test20() { 
		  assertEquals(87.78032, calc.Solve("((((((43.36+3.1+4.87)*2.98)/4.75)*(1.4+1.685))/(-2.784))+5.359*4.4+5.5)+6.2*8.98-7.54/9.3+4.8*8.9-3.2"), 0.1); 
		  }
	/*
	  @Test public void test() { 
	  assertEquals(, calc.Solve(""), 0); 
	  }
	 */

	 
	 /*
	  * Tests de remonte d'ArithmeticException
	  */
	 
	 @Test
		public void test21() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("-4");
		}
	 
	 @Test
		public void test22() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("+8");
		}
	 
	 @Test
		public void test23() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("/8");
		}
	 
	 @Test
		public void test24() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("*9");
		}
	 
	 @Test
		public void test25() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("1++1");
		}
	 
	 @Test
		public void test26() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("5-+8");
		}
	 
	 @Test
		public void test27() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("9*/1");
		}
	 
	 @Test
		public void test28() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("9(4)");
		}
	 
	 @Test
		public void test29() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("(8)4");
		}
	 
	 @Test
		public void test30() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("8+7*()+3");
		}
	 
	 @Test
		public void test31() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("hello world");
		}
	 
	 @Test
		public void test32() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("((8+9)*7");
		}
	 
	 @Test
		public void test33() {
			thrown.expect(ArithmeticException.class);
			calc.Solve(")127(");
		}
	 
	 @Test
		public void test34() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("4+)8/7)");
		}
	 
	 @Test
		public void test35() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("((42)");
		}
	 
	 @Test
		public void test36() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("");
		}
	 
	 @Test
		public void test37() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("4+(-8*7)");
		}
	 
	 @Test
		public void test38() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("4+(-(-8))*7");
		}
	 /*@Test
		public void test() {
			thrown.expect(ArithmeticException.class);
			calc.Solve("");
		}*/
}
