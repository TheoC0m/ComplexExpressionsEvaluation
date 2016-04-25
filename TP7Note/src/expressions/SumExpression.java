package expressions;

public class SumExpression implements Expression {

	private Expression leftSide;
	private Expression rightSide;
	
	public SumExpression() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double solve() {
		return this.leftSide.solve() + this.rightSide.solve();
	}

}
