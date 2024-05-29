import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data){
            this.data = data;
        }
    }

    void DoublyLinkedList(){
        head=null;
        tail=null;
        length=0;
    }
    int length(){
        return length;
    }
    boolean isEmpty(){
        return length == 0;
    }
    void InsertLast(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()){
            head = newNode;
        }else {
            tail.next = newNode;
            newNode.prev=tail;
        }
        tail = newNode;
        length++;
    }
    void InsertFirst(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()){
            tail = newNode;
        }else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    void displayFront(){
        if (isEmpty()){
            return;
        }
        ListNode temp=head;
        while (temp != null){
            System.out.print(temp.data +"--->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    void displayBackward(){
        if (tail == null){
            return;
        }
        ListNode temp = tail;
        while (tail != null){
            System.out.print(tail.data +"--->");
            tail=tail.prev;
        }
        System.out.println("null");
    }
    public int deleteFirst(){
        if (isEmpty()){
            throw new RuntimeException();
        }
        ListNode temp = head;
        if (head == tail){
            tail = null;
        }else {
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp.data;
    }
    public int deleteLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (head == tail){
            head = null;
        }
        else {
            tail.prev.next=null;
        }
        tail = tail.prev;
        temp.prev = null;
        length--;
        return temp.data;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.InsertLast(1);
        dll.InsertLast(2);
        dll.InsertLast(3);
        dll.InsertLast(4);
        dll.displayFront();
        //dll.displayBackward();

        dll.deleteFirst();

        dll.displayFront();

        dll.deleteLast();

        dll.displayFront();
    }
}






