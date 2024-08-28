import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        //isBalanced("{[()]}");
        //previousGreaterElemet(new int[]{20,30,10,5,15});
        //previousGreaterElemtThroughStack(new int[]{20,30,10,5,15});
        //nextGreaterElement(new int[]{5,15,10,8,6,12,9,18});
        //nextGreaterElemtThroughStack(new int[]{5,15,10,8,6,12,9,18});
        //LargestRectangularArea(new int[]{6,2,5,4,1,5,6});
        infixToPostfix(new String[]{"3", "+", "5", "*", "2"});

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

    public static void previousGreaterElemet(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int j;
            for (j=i-1; j>=0; j--) {
                if (arr[j]<arr[i]) {
                    System.out.println(arr[i]);
                    break;
                }

            }
            if (j==-1) {
                System.out.println(-1);
            }
        }
    }
    public static void previousGreaterElemtThroughStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        System.out.println(-1);
        for (int i=1; i< arr.length; i++) {
            while (stack.empty()==false && stack.peek()<=arr[i]) {
                stack.pop();
            }
            int check = stack.empty()? -1 :stack.peek();
            System.out.println(check);
            stack.push(arr[i]);
        }
    }

    public static void nextGreaterElement(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int j;
            for (j=i+1; j<arr.length; j++) {
                if (arr[j]>arr[i]) {
                    System.out.println(arr[j]);
                    break;
                }

            }
            if (j == arr.length) {
                System.out.println(-1);
            }
        }
    }
    public static void nextGreaterElementThroughStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length-1]);
        System.out.println(-1);
        for (int i= arr.length-2; i>=0; i--) {
            while (stack.empty()==false && stack.peek()<=arr[i]) {
                stack.pop();
            }
            int check = stack.empty()? -1 :stack.peek();
            System.out.println(check);
            stack.push(arr[i]);
        }
    }

    public static int LargestRectangularArea(int[] arr) {
        int n = arr.length;
        int result = 0;
        for (int i =0; i<n; i++) {
           int current = arr[i];
            for (int j=i-1; j>=0; j--) {
                if ( arr[j] >= arr[i]) {
                    current+=arr[i];
                }else break;
            }
            for (int j=i+1; j<n; j++) {
                if ( arr[j] >= arr[i]) {
                    current+=arr[i];
                }else break;
            }
            result = Math.max(result,current);
        }
        System.out.println(result);
        return result;
    }

    public static String infixToPostfix(String[] arr) {
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (String token : arr) {
            if (isOperator(token)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(token);
            } else {
                result.append(token).append(" ");
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }
        System.out.println(result.toString().trim());
        return result.toString().trim();
    }
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    private static int precedence(String operator) {
        switch (operator) {
            case "+": case "-":
                return 1;
            case "*": case "/":
                return 2;
            default:
                return -1;
        }
    }


}



