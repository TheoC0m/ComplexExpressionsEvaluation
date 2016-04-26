package expressions;

public class SubstractionExpression implements Expression {

	private Expression leftSide;
	private Expression rightSide;

	public SubstractionExpression() {
	}

	@Override
	public Double solve() {
		return this.leftSide.solve() - this.rightSide.solve();
	}

	@Override
	public boolean isOperator() {
		return true;
	}
}
