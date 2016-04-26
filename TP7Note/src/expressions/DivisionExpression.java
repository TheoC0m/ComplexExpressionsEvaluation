package expressions;

public class DivisionExpression implements Expression {

	private Expression leftSide;
	private Expression rightSide;

	public DivisionExpression() {
	}

	@Override
	public Double solve() {
		return this.leftSide.solve() / this.rightSide.solve();
	}

	@Override
	public boolean isOperator() {
		return true;
	}

}
