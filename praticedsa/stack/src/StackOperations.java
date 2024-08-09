import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        isBalanced("{[()]}");
    }

    public static boolean isBalanced(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                s.push(current);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if (!matching(s.peek(), current)) {
                    System.out.println("Its not Balanced");
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        System.out.println("Its Balanced");
        return s.isEmpty();
    }
    public static boolean matching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

}



