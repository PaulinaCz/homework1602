import java.util.Stack;

public class CheckingBrackets {

    public CheckingBrackets() {
    }

    public boolean areBracketsClosing(String str) {

        if (str.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{'
                    || str.charAt(i) == '['
                    || str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (!stack.empty() && (
                    str.charAt(i) == '}' && stack.peek() == '{'
                    || str.charAt(i) == ']' && stack.peek() == '['
                    || str.charAt(i) == ')' && stack.peek() == '('
                    )){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
