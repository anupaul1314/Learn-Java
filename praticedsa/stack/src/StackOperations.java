import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        //isBalanced("{[()]}");
        //previousGreaterElemet(new int[]{20,30,10,5,15});
        //previousGreaterElemtThroughStack(new int[]{20,30,10,5,15});
        //nextGreaterElement(new int[]{5,15,10,8,6,12,9,18});
        nextGreaterElemtThroughStack(new int[]{5,15,10,8,6,12,9,18});
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
            if (j== arr.length) {
                System.out.println(-1);
            }
        }
    }
    public static void nextGreaterElemtThroughStack(int[] arr) {
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

}



