package expressions;

public class TerminalExpression implements Expression{
	
	private String value;

	public TerminalExpression(String value) {
		this.value = value;	
	}

	@Override
	public Double solve() {
		return Double.parseDouble(this.value);
	}
	

}
 