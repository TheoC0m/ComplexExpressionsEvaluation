package expressions;

public abstract class AbstractOperatorExpression implements Expression {

	protected Expression leftSide;
	protected Expression rightSide;

	public AbstractOperatorExpression() {
	}

	public Expression getLeftSide() {
		return leftSide;
	}

	public void setLeftSide(Expression leftSide) {
		this.leftSide = leftSide;
	}

	public Expression getRightSide() {
		return rightSide;
	}

	public void setRightSide(Expression rightSide) {
		this.rightSide = rightSide;
	}

}
