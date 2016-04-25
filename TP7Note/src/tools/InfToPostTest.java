package tools;

public class InfToPostTest {
	public static void main(String[] args) {
		
		String input = "(((4+6)*2-5+5*(3))+10)/2";
		InfixToPostfix conv = new InfixToPostfix();
		
		
		System.out.println(conv.inToPost(input));
		
	}
}

