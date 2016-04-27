package expressions;

public class ExpressionFactory {

	private static ExpressionFactory instance;

	private ExpressionFactory() {
	}

	public static ExpressionFactory getInstance() {
		if (instance == null) {
			instance = new ExpressionFactory();
		}
		return instance;
	}

	public Expression getExpression(String token) {

		// booleen a true si le la chaine token est un nombre
		boolean isnumber = token.matches("^(\\d+(\\.\\d+)?)$");
		Expression expr;

		if (isnumber) {
			// si c'est un nombre on retourne une TerminalExpression ayant sa
			// valeur
			expr = new TerminalExpression(token);
		} else {
			// sinon c'est un operateur et on retourne l'objet adequat
			switch (token) {

			case "+":
				expr = new SumExpression();
				break;

			case "-":
				expr = new SubstractionExpression();
				break;

			case "/":
				expr = new DivisionExpression();
				break;

			case "*":
				expr = new MultiplicationExpression();
				break;

			default:
				throw new ArithmeticException("pas d'expression correspondant a ce symbole");

			}
		}
		return expr;
	}
}
