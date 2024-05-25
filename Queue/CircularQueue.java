import java.util.NoSuchElementException;

public class CircularQueue {
    private ListNode front;
    private ListNode rear;
    private int length;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    CircularQueue() {
        front = null;
        rear = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return this.length;
    }

    public void Enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        newNode.next = front; // Again make the queue circular
        length++;
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            throw new NoSuchElementException("Circular Queue is empty. Cannot dequeue.");
        }
        ListNode temp = front;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            rear.next = front; // Again make the queue circular
        }
        length--;
        return temp.data;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        ListNode current = front;
        System.out.print("Queue: ");
        while (current != rear) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.print(current.data + "<-=="); // Display the last element
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();

        cq.Enqueue(1);
        cq.Enqueue(2);
        cq.Enqueue(3);
        cq.Enqueue(4);
        cq.Enqueue(5);
        cq.display(); // Queue: 1 2 3 4 5

        cq.Dequeue();
        cq.Dequeue();
        cq.display(); // Queue: 3 4 5

        cq.Enqueue(6);
        cq.display(); // Queue: 3 4 5 6
    }
}
