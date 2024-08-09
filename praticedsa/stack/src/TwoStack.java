public class TwoStack {
    int[] arr;
    int cap;
    int top1;
    int top2;

    TwoStack(int n) {
        cap = n;
        top1 = -1;
        top2 = cap;
        arr = new int[n];
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        }
        System.out.println("Stack 1 Underflow");
        return -1;
    }

    int pop2() {
        if (top2 < cap) {
            int x = arr[top2];
            top2++;
            return x;
        }
        System.out.println("Stack 2 Underflow");
        return -1;
    }

    public static void main(String[] args) {
        TwoStack twoStack = new TwoStack(5);
        twoStack.push1(5);
        twoStack.push2(10);
        twoStack.push2(15);
        twoStack.push1(11);
        twoStack.push2(7);

        System.out.println("Popped element from stack1 is: " + twoStack.pop1());
        System.out.println("Popped element from stack2 is: " + twoStack.pop2());
        System.out.println();
    }
}
