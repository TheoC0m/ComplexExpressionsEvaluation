package expressions;

public class MultiplicationExpression extends AbstractOperatorExpression {

	public MultiplicationExpression() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double solve() {
		if(this.leftSide != null && this.rightSide != null){
		return this.leftSide.solve() * this.rightSide.solve();
		}
		else{
			throw new ArithmeticException("une operande est manquante");
		}
	}

	@Override
	public boolean isOperator() {
		return true;
	}
}
