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
	
	public Expression getExpression(String token){
		
		
	}
}
