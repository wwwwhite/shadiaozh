package Int;

public class Client {
public static void main(String[] args) {
	Expression isMale=getMaleExpression();
	Expression isMarriedWoman=getMarriedWomanExpression();
	System.out.println("John is male?"+isMale.interpret("John"));
	System.out.println("Julie is a married women?"+isMarriedWoman.interpret("Married Julie"));
}

private static Expression getMarriedWomanExpression() {
	// TODO Auto-generated method stub
	Expression julie =new TerminalExpression("julie");
	Expression married =new TerminalExpression("married");
	return new AndExpression(julie,married);
}

private static Expression getMaleExpression() {
	// TODO Auto-generated method stub
	Expression robert =new TerminalExpression("Robert");
	Expression john =new TerminalExpression("John");
	
	return new OrExpression(robert,john);
}
}
