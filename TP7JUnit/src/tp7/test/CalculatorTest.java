package tp7.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.lorraine.univ.tp.Calculator;

public class CalculatorTest {
	
	Calculator calc = new Calculator();

	@Test
	public void test1() {
		assertEquals(9, calc.Solve("4+5"), 0);
		
	}
	
	
	
	
	/*@Test
	public void test() {
		assertEquals(, calc.Solve(""));
	}*/

}
