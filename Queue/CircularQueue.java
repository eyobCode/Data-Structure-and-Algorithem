public class CircularQueue {
    private ListNode front;
    private ListNode rear;
    private int length;


    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    CircularQueue(){
        front=null;
        rear=null;
        length=0;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void Enqueue(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()){
            front=newNode;
        }else {

        }
    }
}
