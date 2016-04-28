package tp7.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.lorraine.univ.tp.Calculator;

public class CalculatorTest {

	Calculator calc = new Calculator();

	@Test
	public void test1() {
		assertEquals(-1, calc.Solve("(-1)"), 0);
	}

	@Test
	public void test2() {
		assertEquals(9, calc.Solve("4+5"), 0);
	}

	@Test public void test3() { 
		  assertEquals(20, calc.Solve("(((4+6)*2-5+5*(3))+10)/2"), 0);
		}
	
	@Test public void test4() { 
		  assertEquals(199.5, calc.Solve("(( (-7) + ( 1+ (-8) * (-9) * (-5) ) + 1) / (-2))+1 - ((2))*(((-8)))"), 0);
		}
	
	@Test public void test5() { 
		  assertEquals(182.5, calc.Solve("( (-7) + ( 1+ (-8) * (-9) * (-5) ) + 1) / (-2)"), 0);
		}
	/*
	  @Test public void test() { 
	  assertEquals(, calc.Solve(""), 0);
	}
	 */

}
