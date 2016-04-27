package expressions;

public class DivisionExpression extends AbstractOperatorExpression {

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
