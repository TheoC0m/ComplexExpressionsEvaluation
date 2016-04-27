package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Conversion d'une expression en notation postfixee code inspire d'un exemple
 * de l'algo de shunting-yard par Andrei Ciobanu et adapte aux besoin du projet
 **/
public class InfixToPostfix {

	private static final int LEFT_ASSOC = 0;
	private static final int RIGHT_ASSOC = 1;

	private static final Map<String, int[]> OPERATORS = new HashMap<String, int[]>();

	static {
		OPERATORS.put("+", new int[] { 0, LEFT_ASSOC });
		OPERATORS.put("-", new int[] { 0, LEFT_ASSOC });
		OPERATORS.put("*", new int[] { 5, LEFT_ASSOC });
		OPERATORS.put("/", new int[] { 5, LEFT_ASSOC });
		// OPERATORS.put("%", new int[] { 5, LEFT_ASSOC });
		OPERATORS.put("^", new int[] { 10, RIGHT_ASSOC });
	}

	private boolean isOperator(String token) {
		return OPERATORS.containsKey(token);
	}

	private boolean isAssociative(String token, int type) {
		if (!isOperator(token)) {
			throw new IllegalArgumentException("Invalid token: " + token);
		}
		if (OPERATORS.get(token)[1] == type) {
			return true;
		}
		return false;
	}

	private int cmpPrecedence(String token1, String token2) {
		if (!isOperator(token1) || !isOperator(token2)) {
			throw new IllegalArgumentException("Invalid tokens: " + token1 + " " + token2);
		}
		return OPERATORS.get(token1)[0] - OPERATORS.get(token2)[0];
	}

	public String[] stringOptimize(String s) {
		// suppression des espaces
		s = s.replaceAll("\\p{Space}", "");
		//remplace les , par des .
		s = s.replaceAll(",", ".");
		
		//remplace -(-x) par (0-(0-x))
		s = s.replaceAll("^.{0}\\(*-\\(+(-\\d+(\\.\\d+)?)\\)+","(0-(0$1))");
		
		/* remplace (-x) par (0-x) ou (-x.y) par (0-x.y)
		s = s.replaceAll("\\(-(\\d+(\\.\\d+)?)\\)", "(0-$1)");
		// remplace (-(0-x)) par (0-(0-x))
		s = s.replaceAll("\\(-(\\(0-\\d+(\\.\\d+)?\\))\\)", "(0-$1)");
		*/
		
		//remplace (-x) par (0-x), (-(-x)) par (0-(0-x)) etc
	
		s = s.replaceAll("(\\(+)-", "$10-");
		
		// création d'un tableau de string contenant chaque opérateurs et
		// opérandes
		String[] sarray = s.split("(?<=[-+*/^()])|(?=[-+*/^()])");

		return sarray;

		// \(-\d+\)
	}

	public String inToPost(String infixexpr) {

		String[] inputTokens = this.stringOptimize(infixexpr);

		ArrayList<String> out = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		// pour chaque caractere
		for (String token : inputTokens) {
			if (isOperator(token)) {
				// si c'est un opérateur
				while (!stack.empty() && isOperator(stack.peek())) {

					if ((isAssociative(token, LEFT_ASSOC) && cmpPrecedence(token, stack.peek()) <= 0)
							|| (isAssociative(token, RIGHT_ASSOC) && cmpPrecedence(token, stack.peek()) < 0)) {
						out.add(stack.pop());
						continue;
					}
					break;
				}
				// empiler nouvel opérateur
				stack.push(token);
			} else if (token.equals("(")) {
				stack.push(token);
			} else if (token.equals(")")) {

				while (!stack.empty() && !stack.peek().equals("(")) {
					out.add(stack.pop());
				}
				stack.pop();
			} else {
				out.add(token);
			}
		}
		while (!stack.empty()) {
			out.add(stack.pop());
		}

		StringBuffer sb = new StringBuffer();
		for (String s : out) {
			if (!s.equals(" ")) {
				sb.append(" ");
				sb.append(s);
			}
		}
		return sb.toString().substring(1);

	}
}