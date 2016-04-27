package expressions;

public class SubstractionExpression extends AbstractOperatorExpression {

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
