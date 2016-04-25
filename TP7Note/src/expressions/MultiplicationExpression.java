package expressions;

public class MultiplicationExpression implements Expression {

	private Expression leftSide;
	private Expression rightSide;
	
	public MultiplicationExpression() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double solve() {
		return this.leftSide.solve() * this.rightSide.solve();
	}

}
