package tools;

public class StringManipulation {

	public StringManipulation() {
		// TODO Auto-generated constructor stub
	}

	public String[] stringOptimize(String s) {
		// suppression des espaces
		s = s.replaceAll("\\p{Space}", "");
		// remplace les , par des .
		s = s.replaceAll(",", ".");
		// remplace -(-x) par (0-(0-x)) 
		s = s.replaceAll("^.{0}\\(*-\\(+(-\\d+(\\.\\d+)?)\\)+", "(0-(0$1))");
		//remplace +(+x) par 0+0+x
		s = s.replaceAll("^.{0}\\(*\\+\\(+(\\+\\d+(\\.\\d+)?)\\)+", "0+(0$1)");
		
		
		// remplace (-x) par (0-x), (-(-x)) par (0-(0-x)) etc idem avec +
		s = s.replaceAll("(\\(+)-", "$10-");

		// création d'un tableau de string contenant chaque opérateurs et
		// opérandes
		if(this.isValid(s)){
		String[] sarray = s.split("(?<=[-+*/^()])|(?=[-+*/^()])");
		return sarray;
		}
		else{ 
			throw new ArithmeticException();
		}

		// \(-\d+\)
	}

	public boolean isValid(String s){

		//comptage et comparaison du nombre de ( et )
		int openParentheses = 0;
		int closedParentheses = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '('){
				openParentheses++;
			}
			if(s.charAt(i) == ')'){
				closedParentheses++;
			}
		}
		boolean wrongParenthNumber = (openParentheses != closedParentheses);
		boolean wrongParenthOrder = s.indexOf('(') > s.indexOf(')');
		


		/*valid si
		* pas chaine vide
		* bon ordre de parenthese
		* meme nb parenth
		* pas de -x, +x, /x, *x seul
		* pas de x(...)
		* pas de ()
		*/
		boolean valid = true;
		valid = !(s.isEmpty() || wrongParenthNumber || wrongParenthOrder || s.matches("^(-\\d+(\\.\\d+)?)$") || 
				s.matches("^(\\+\\d+(\\.\\d+)?)$") || s.matches("^(/\\d+(\\.\\d+)?)$") ||
				s.matches("^(\\*\\d+(\\.\\d+)?)$") || s.matches(".*\\d+(\\.\\d+)?\\(+.*") || s.matches(".*\\(\\).*"));
		
		
		
		if(valid){
			return true;
		}
		else{
			throw new ArithmeticException("expression incorrecte");
		}
	}

}
