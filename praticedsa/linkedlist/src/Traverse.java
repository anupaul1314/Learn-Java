public class Traverse{
    public static void printList(Node head){
        Node curr = head;
        while (curr!=null){
            System.out.println(curr.data+ " ");
            curr = curr.next;
        }
    }
}
