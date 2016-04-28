package tools;

import java.util.ArrayList;
import java.util.Stack;

import expressions.AbstractOperatorExpression;
import expressions.Expression;
import expressions.ExpressionFactory;

public class TreeBuild {

	public TreeBuild() {
		// TODO Auto-generated constructor stub
	}

	public Expression build(String postfixexpr, ExpressionFactory expfact) {

		Stack<Expression> lastinserted = new Stack<Expression>();
		// creation tableau de string contenant 1 operande/operateur par case
		//NECESSITE JAVA 8 CAR LES VERSIONS ANTERIEURS N'ONT PAS LE MEME COMPORTEMENT SUR CETTE FONCTION !!!!!
		String[] tokenarray = postfixexpr.split("\\s+");
		
		
		

		// on construit la racine de l'abre avec le premier token
		Expression racine = expfact.getExpression(tokenarray[tokenarray.length - 1]);
		// on verifie que la racine est bien un operateur
		if (racine.isOperator()) {
			// on push l'expression dans la pile
			lastinserted.push(racine);
		} else {
			throw new ArithmeticException("la racine doit être un operateur");
		}

		
		// on lit l'expression postfixe de droite a gauche
		for (int i = tokenarray.length - 2; i >= 0; i--) {
			// on construit l'objet correspondant a l'element suivant
			Expression e = expfact.getExpression(tokenarray[i]);

			// si le dernier elemenet insere est un operateur
			if (lastinserted.peek().isOperator()) {
				// on ajoute l'expression en fils droit (rightside)
				((AbstractOperatorExpression) lastinserted.peek()).setRightSide(e);
				// on push l'expression ainsi ajoutee sur la pile
				lastinserted.push(e);
			} else {
				/*
				 * le dernier element insere est un nombre on remonte dans
				 * l'abre a partir de la derniere insertion et on trouve le
				 * premier noeud sans fils gauche (on insere pas dans le dernier
				 * noeud, mais a partir de sont pere)
				 */
				// on depile la derniere insertion
				lastinserted.pop();
				boolean trouve = false;
				// tant qu'on a pas trouve ou inserer et que la pile contient
				// bien des operators
				while (!trouve && lastinserted.peek().isOperator()) {
					AbstractOperatorExpression tmpexp = (AbstractOperatorExpression) lastinserted.peek();

					// si le fils gauche est libre
					if (tmpexp.getLeftSide() == null) {
						// on insere l'expression courante en fils gauche et on
						// la push sur la stack
						tmpexp.setLeftSide(e);
						lastinserted.push(e);
						trouve = true;
					} else {
						// le fils gauche n'est pas libre : on depile (pour
						// remonter dans l'arbre)
						lastinserted.pop();
						if(lastinserted.empty()){
							throw new ArithmeticException("pile vide : expression incorrecte");
						}
					}
				}

			}
		}
		return racine;
	}
}
