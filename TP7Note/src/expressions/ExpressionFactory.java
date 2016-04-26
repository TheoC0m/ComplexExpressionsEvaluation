package expressions;

public class ExpressionFactory {

	private ExpressionFactory instance;

	private ExpressionFactory() {
	}

	public ExpressionFactory getInstance() {
		if (this.instance == null) {
			this.instance = new ExpressionFactory();
		}
		return this.instance;
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
				throw new ArithmeticException();

			}
		}
		return expr;
	}
}
