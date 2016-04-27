package expressions;

public class MultiplicationExpression extends AbstractOperatorExpression{

	private Expression leftSide;
	private Expression rightSide;

	public MultiplicationExpression() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double solve() {
		return this.leftSide.solve() * this.rightSide.solve();
	}

	@Override
	public boolean isOperator() {
		return true;
	}
}
