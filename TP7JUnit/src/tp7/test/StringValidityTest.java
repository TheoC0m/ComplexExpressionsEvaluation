package tp7.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import tools.StringManipulation;

public class StringValidityTest {
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	StringManipulation sm = new StringManipulation();

	@Test
	public void test1() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("-1");
	}
	
	@Test
	public void test2() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("9+6(8*9)");
	}
	
	@Test
	public void test2_2() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("9(");
	}
	
	
	@Test
	public void test3() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("85+)9*3)/(4*6");
	}
	
	@Test
	public void test4() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("((54+6)*7))");
	}
	
	@Test
	public void test5() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("5+()-4");
	}
	
	@Test
	public void test6() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("+5");
	}
	
	@Test
	public void test7() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("*6");
	}
	
	@Test
	public void test8() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("/5");
	}
	
	
	@Test
	public void test10() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("127(.");
	}
	/*@Test
	public void test() {
		thrown.expect(ArithmeticException.class);
		sm.isValid("");
	}*/

}
