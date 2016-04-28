package expressions;

public class DivisionExpression extends AbstractOperatorExpression {

	public DivisionExpression() {
	}

	@Override
	public Double solve() {
		if (this.rightSide.solve() != 0) {
			if (this.leftSide != null && this.rightSide != null) {
				return this.leftSide.solve() / this.rightSide.solve();
			} else {
				throw new ArithmeticException("une operande est manquante");
			}
		} else {
			// si le diviseur = 0 on lance exception
			throw new ArithmeticException("division par zero");
		}
	}

	@Override
	public boolean isOperator() {
		return true;
	}

}
