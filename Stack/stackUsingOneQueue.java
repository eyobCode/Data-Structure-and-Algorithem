class stackUsingOneQueue {
    private Queue q;


    stackUsingOneQueue(){
        q=new Queue();
    }
    void push(int data){
        q.enqueue(data); //fist enqueue in the queue

        for (int i = 1; i < q.size(); i++) {
            q.enqueue(q.dequeue());  // Rotate the queue to move the new element to the front
        }
    }
}
class Queue{
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
