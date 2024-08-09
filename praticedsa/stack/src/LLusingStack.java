class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

class LLStack{
    Node head;
    int sz;
    LLStack(){
        head = null;
        sz = 0;
    }
    int size(){
        return sz;
    }

    boolean isEmpty(){
        return head==null;
    }

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        sz++;
        System.out.println(temp.data);
    }

    int pop(){
        if (isEmpty()){
            System.out.println("The Stack is Empty");
        }
        int res = head.data;
        head = head.next;
        sz--;
        return res;
    }
    int peek(){
        if (isEmpty()){
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
}


public class LLusingStack {
    public static void main(String[] args) {
        LLStack llStack = new LLStack();
        llStack.push(10);
        llStack.push(20);
        llStack.push(30);
        System.out.println("Pooped Element: "+llStack.pop());
        System.out.println(llStack.size());
    }
}

