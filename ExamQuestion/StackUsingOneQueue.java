class StackUsingOneQueue {
    private QueueS q;


    StackUsingOneQueue(){
        q=new QueueS();
    }
    void push(int data){
        q.enqueue(data); //fist enqueue in the queue

        for (int i = 1; i < q.size(); i++) {
            q.enqueue(q.dequeue());  // Rotate the queue to move the new element to the front
        }
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return q.dequeue();
    }
    public int length(){
        return q.size();
    }
    public boolean isEmpty(){
        return q.isEmpty();
    }
    public int top(){
        if (isEmpty()){
            throw new RuntimeException("stack is already empty");
        }
        return q.front();
    }

    public static void main(String[] args) {
        StackUsingOneQueue stack = new StackUsingOneQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.top());    // Output: 4
        System.out.println(stack.pop());    // Output: 4
        System.out.println(stack.isEmpty()); // Output: false

        System.out.println(stack.top());    // Output: 3
        System.out.println(stack.pop());    // Output: 3
        System.out.println(stack.isEmpty()); // Output: false

        stack.push(5);
        System.out.println(stack.top());    // Output: 5
        System.out.println(stack.pop());    // Output: 5
        System.out.println(stack.isEmpty()); // Output: false
    }

}
class QueueS {
    public boolean length;
    private ListNode front;
    private ListNode rear;
    private int legth;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    void Queue(){
        front = null;
        rear = null;
        legth = 0;
    }
    public int front(){
        if (isEmpty()){
            throw new RuntimeException("Empty ('-')");
        }
        return front.data;
    }
    public boolean isEmpty() {return legth == 0;}
    public int size(){return legth;}
    public int dequeue(){
        if (isEmpty()){throw new RuntimeException("Queue is empty.");}
        int temp = front.data;
        front=front.next;
        legth--;
        return temp;
    }
    public void enqueue(int data){
        ListNode node = new ListNode(data);
        if (isEmpty()){front=node;}
        else{rear.next=node;}
        rear=node;
        legth++;
    }
}
