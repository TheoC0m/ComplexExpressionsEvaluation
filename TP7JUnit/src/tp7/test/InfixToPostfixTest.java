package tp7.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tools.InfixToPostfix; 

public class InfixToPostfixTest {
	


	/*
	 * Test simple
	 */
	@Test
	public void test1() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("4 5 +", conv.inToPost("4+5"));
	}
	
	/*
	 * Test simple
	 */
	@Test
	public void test2() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("8 9 + 2 -", conv.inToPost("8+9-2"));
	}
	
	/*
	 * Test simple
	 */
	@Test
	public void test3() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("8 9 + 2 4 * -", conv.inToPost("8+9-2*4"));
	}
	
	/*
	 * Test simple avec parentheses
	 */
	@Test
	public void test4() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("8 9 + 2 4 * - 1 +", conv.inToPost("(8+9-2*4)+1"));
	}
	
	/*
	 * Test simple avec parentheses
	 */
	@Test
	public void test5() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("8 9 + 2 4 * - 1 2 / +", conv.inToPost("(8+9-2*4)+1/2"));
	}
	
	/*
	 * Test avec parentheses
	 */
	@Test
	public void test6() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("8 9 + 2 4 * - 1 2 / 4 * + 0 9 - +", conv.inToPost("(8+9-2*4)+(1/2)*4+(-9)"));
	}
	
	
	/*
	 * Test avec parentheses
	 */
	@Test
	public void test7() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("4 6 + 2 * 5 - 5 3 * + 10 + 2 /", conv.inToPost("(((4+6)*2-5+5*(3))+10)/2"));
	}
	
	
	/*
	 * Test avec parentheses et nombres negatifs
	 */
	@Test
	public void test8() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("0 7 - 1 0 8 - 0 9 - * 0 5 - * + + 1 + 0 2 - /", conv.inToPost("( (-7) + ( 1+ (-8) * (-9) * (-5) ) + 1) / (-2)"));
	}
	
	/*
	 * Test avec parentheses et nombres negatifs
	 */
	@Test
	public void test9() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("0 7 - 1 0 8 - 0 9 - * 0 5 - * + + 1 + 0 2 - / 1 + 2 0 8 - * -", conv.inToPost("(( (-7) + ( 1+ (-8) * (-9) * (-5) ) + 1) / (-2))+1 - ((2))*(((-8)))"));
	}
	
	/*
	 * Test avec parentheses et nombres negatifs
	 */
	@Test
	public void test10() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("0 741 - 12 0 89 - 0 92 - * 0 5369 - * + + 10 + 0 212 - / 18 + 26 0 87 - * -", conv.inToPost("(( (-741) + ( 12+ (-89) * (-92) * (-5369) ) + 10) / (-212))+18 - ((26))*(((-87)))"));
	}
	
	/*
	 * Test avec parentheses et nombres doublement negatifs
	 */
	@Test
	public void test11() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("1 6 + 9 8 * - 5 / 0 0 8 - - +", conv.inToPost("(1+6-9*8)/5+(-(-8))"));
	}

	/*
	 * Test nombre doublement negatif
	 */
	@Test
	public void test12() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("0 0 0 5 - - -", conv.inToPost("(-(-(-5)))"));
	}
	
	/*
	 * Test nombre doublement negatif
	 */
	@Test
	public void test13() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("0 0 7 - -", conv.inToPost("-(-7)"));
	}
	
	@Test
	public void test13_2() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("0 0 7 + +", conv.inToPost("+(+7)"));
	}
	
	/*
	 * Test nombre decimal
	 */
	@Test
	public void test14() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("12.5 8.9 + 125.36 -", conv.inToPost("12.5 + 8.9 - 125.36"));
	}
	
	/*
	 * Test nombre decimal + parenthese + negatif
	 */
	@Test
	public void test15() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("12.5 8.9 + 125.36 - 0 98.5 - *", conv.inToPost("(12.5 + 8.9 - 125.36)*(-98.5)"));
	}
	
	/*
	 * Test nombre decimal + parenthese + double negatif
	 */
	@Test
	public void test16() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("12.5 8.9 + 125.36 - 0 0 5456.35151 - - *", conv.inToPost("(12,5 + 8,9 - 125,36)*(-(0-5456,35151))"));
	}
	
	@Test
	public void test1_2() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("1", conv.inToPost("(1)"));
	}
	
	@Test
	public void test1_3() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("1", conv.inToPost("((1))"));
	}
	
	@Test
	public void test1_4() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("0 1 -", conv.inToPost("((-1))"));
	}
	
	
	/*@Test
	public void test() {
		InfixToPostfix conv = new InfixToPostfix();
		assertEquals("", conv.inToPost(""));
	}*/

}
