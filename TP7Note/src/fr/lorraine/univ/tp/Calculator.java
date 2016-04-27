package fr.lorraine.univ.tp;

import expressions.Expression;
import expressions.ExpressionFactory;
import tools.InfixToPostfix;
import tools.TreeBuild;

public class Calculator {

	private InfixToPostfix conversion;
	private TreeBuild tb;
	private ExpressionFactory expfact;
	
	public Calculator() {
		this.conversion = new InfixToPostfix();
		this.tb = new TreeBuild();
		this.expfact = ExpressionFactory.getInstance();
	}

	public double Solve(String equation){
		
		
		//transformation de l'expression en notation postfixee
		String postfixequation = conversion.inToPost(equation);
		//construction de l'arbre a partir de l'expression postfixe
		Expression tree = tb.build(postfixequation, expfact);
		//evaluation de l'expression 
		double res = tree.solve();
		return res;
	}
}
 