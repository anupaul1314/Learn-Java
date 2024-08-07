import java.util.ArrayList;

public class ArrayUsingStack {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        int poppedElement = s.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println(s.peek());

        //Dynamic Array
        NewStack newStack = new NewStack();
        newStack.push(10);
    }
}

class MyStack{
    int[] arr;
    int cap;
     int top;
    MyStack(int c){
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == cap-1;
    }
    public int push(int data){
        if (isFull()) {
            System.out.println("Stack Overflow");
            return -1;
        }
        top++;
        arr[top] = data;
        System.out.println(data);
        return data;
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }
    public int size(){
        return top+1;
    }
    public int peek(){
        return arr[top];
    }
}

class NewStack{
    ArrayList<Integer> al = new ArrayList<>();
    void push(int x){
        al.add(x);
        System.out.println(x);
    }
    int pop(){
        int res = al.get(al.size()-1);
        al.remove(res);
        return res;
    }
    int peek(){
        return al.get(al.size()-1);
    }
    boolean isEmpty(){
        return al.isEmpty();
    }
    int size(){
        return al.size();
    }
}

