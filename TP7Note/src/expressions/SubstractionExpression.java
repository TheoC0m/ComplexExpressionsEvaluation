package expressions;

public class SubstractionExpression extends AbstractOperatorExpression {

	public SubstractionExpression() {
	}

	@Override
	public Double solve() {
		if (this.leftSide != null && this.rightSide != null) {
			return this.leftSide.solve() - this.rightSide.solve();
		} else {
			throw new ArithmeticException("une operande est manquante");
		}
	}

	@Override
	public boolean isOperator() {
		return true;
	}
}
