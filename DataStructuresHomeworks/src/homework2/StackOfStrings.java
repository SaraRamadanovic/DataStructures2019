package homework2;


import java.util.Stack;
public class StackOfStrings {	
	public static void main(String[] args) {
		Stack<String> operands = new Stack<String>();
		Stack<Double> values = new Stack<Double>();
		String input = "( ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";

		String[] varr = input.split(" ".toString());

		for (String s : varr) {
			if (s.equals("("))
				;
			else if (s.equals("+"))
				operands.push(s);
			else if (s.equals("-"))
				operands.push(s);
			else if (s.equals("*"))
				operands.push(s);
			else if (s.equals("/"))
				operands.push(s);
			else if (s.equals("sqrt"))
				operands.push(s);
			else if (s.equals(")")) {
				String o = operands.pop();
				double v = values.pop();
				if (o.equals("+"))
					v = values.pop() + v;
				else if (o.equals("-"))
					v = values.pop() - v;
				else if (o.equals("*"))
					v = values.pop() * v;
				else if (o.equals("/"))
					v = values.pop() / v;
				else if (o.equals("sqrt"))
					v = Math.sqrt(v);
				values.push(v);
			} else
				values.push(Double.parseDouble(s));
		}
		System.out.println(values.pop());
	}
}