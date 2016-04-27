package expressions;

public class DivisionExpression extends AbstractOperatorExpression {

	public DivisionExpression() {
	}

	@Override
	public Double solve() {
		if(this.rightSide.solve() != 0){
		return this.leftSide.solve() / this.rightSide.solve();
		}
		else{
			//si le diviseur = 0 on lance exception
			throw new ArithmeticException("division par zero");
		}
	}

	@Override
	public boolean isOperator() {
		return true;
	}

}
