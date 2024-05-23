import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    Queue(){
        front = null;
        rear = null;
        length = 0;
    }

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmty(){
        return length == 0;
    }
    public void enQueue(int data){
        ListNode node = new ListNode(data);
        if (isEmty()){
            front = node;
        }else {
            rear.next = node;
        }
        rear = node;
        length ++;
    }
    public int deQueue(){
        if (isEmty()){
            throw new NoSuchElementException("Queue is already empty!!");
        }
        if (front == null){
            rear = null;
        }
        int result = front.data;
        front = front.next;
        length--;
        return result;
    }
    public void print(){
        if (isEmty()){
            return;
        }
        ListNode count = front;
        while (count != null){
            System.out.print(count.data+"---->");
            count = count.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println(queue.length); // length is 0
        System.out.println(queue.isEmty()); // true

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        queue.print(); // 1--->2--->3--->4--->null

        System.out.println(queue.isEmty()); // false

        System.out.println(queue.deQueue()); // 1

        queue.print(); // 2--->3--->4--->null

    }
}
