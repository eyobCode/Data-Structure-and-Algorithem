import java.util.EmptyStackException;

class LinkedListQueue {
    private ListNode front;
    private ListNode rear;
    private int length;


    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }
}
class stackLinkedList {

    private LinkedListQueue queue;
    private int length;

    public stackLinkedList() {
        this.queue = new LinkedListQueue();
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        queue.enqueue(data);
        length++;

        // Rotate the queue to move the newly added element to the front
        for (int i = 1; i < length; i++) {
            queue.enqueue(queue.dequeue());
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        length--;
        return queue.dequeue();
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        stackLinkedList stack = new stackLinkedList();

        System.out.println(stack.isEmpty()); // true

        stack.push(1); // insert 1
        stack.push(2); // insert 2
        stack.push(3); // insert 3
        stack.push(4); // insert 4

        System.out.println(stack.length());  // length 4
        System.out.println(stack.pop());     // 4
        System.out.println(stack.length());  // length 3
        System.out.println(stack.peek());    // 3
        System.out.println(stack.isEmpty()); // false
    }
}

