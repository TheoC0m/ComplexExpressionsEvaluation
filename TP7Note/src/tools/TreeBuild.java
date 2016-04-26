package tools;

import java.util.Stack;

import expressions.Expression;
import expressions.ExpressionFactory;

public class TreeBuild {

	public TreeBuild() {
		// TODO Auto-generated constructor stub
	}

	public Expression build(String postfixexpr, ExpressionFactory expfact){
		
		Stack<Expression> lastinserted= new Stack<Expression>();
		//creation tableau de string contenant les operandes et operateurs 
		String[] tokenarray = postfixexpr.split("(?<=[-+*/^])|(?=[-+*/^])");
		
		//on construit la racine de l'abre avec le premier token
		Expression racine = expfact.getExpression(tokenarray[tokenarray.length-1]);
		//on push l'expression dans la pile
		lastinserted.push(racine);
		
		//on lit l'expression postfixe de droite a gauche
		for(int i = tokenarray.length-2; i<=0; i--){
			//on construit l'objet correspondant a l'element suivant
			Expression e = expfact.getExpression(tokenarray[i]);
			
		}
		
		
		
	}
}
