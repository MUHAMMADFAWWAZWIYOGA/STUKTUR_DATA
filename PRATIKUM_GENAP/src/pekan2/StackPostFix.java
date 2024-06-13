package pekan2;

import java.util.Stack;
import java.util.Scanner;
public class StackPostFix {
	public static int postfixEvaluate(String expression) {
		Stack<Integer> a = new Stack<>();
		Scanner keyboard = new Scanner(expression);
		while(keyboard.hasNext()) {
			if (keyboard.hasNextInt()) {
				a.push(keyboard.nextInt());
			}
			else {
				String operator = keyboard.next();
				int operand2 = a.pop();
				int operand1 = a.pop();
				if(operator.equals("+")) {
					a.push(operand1 + operand2);
				}else if(operator.equals("-")) {
					a.push(operand1 - operand2);
				}else if(operator.equals("*")) {
					a.push(operand1 * operand2);
				}else if(operator.equals("/")) {
					a.push(operand1 / operand2);
				}
			}
		}
		return a.pop();
	}
	
	public static void main(String[] args) {
	System.out.println("Hasil postfix = " + postfixEvaluate("5 2 4 * + 7 -"));

	}

}
